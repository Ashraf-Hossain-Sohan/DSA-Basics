package GraphAlgorithms;

import java.util.*;

public class ShortestPathUnweightedGraph {

    // Represents a node in the graph
    public static class GraphNode {
        private int val; // Value of the node
        private List<GraphNode> neighbors; // Adjacency list for neighbors

        public GraphNode(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }

        public int getVal() {
            return val;
        }

        public List<GraphNode> getNeighbors() {
            return neighbors;
        }

        public void addNeighbor(GraphNode neighbor) {
            this.neighbors.add(neighbor);
        }
    }

    // Finds the shortest path from a start node to an end node using BFS
    public List<Integer> findShortestPath(GraphNode start, GraphNode end) {
        // Handle null cases for start or end nodes
        if (start == null || end == null) {
            return Collections.emptyList();
        }

        // Queue for BFS traversal
        Queue<GraphNode> queue = new LinkedList<>();
        // Map to store parent of each node, used for path reconstruction
        Map<GraphNode, GraphNode> parentMap = new HashMap<>();
        // Set to keep track of visited nodes to prevent cycles and redundant processing
        Set<GraphNode> visited = new HashSet<>();

        // Start BFS from the 'start' node
        queue.offer(start);
        visited.add(start);
        parentMap.put(start, null); // Start node has no parent

        // Perform BFS
        while (!queue.isEmpty()) {
            GraphNode current = queue.poll();

            // If the current node is the 'end' node, we found the shortest path
            if (current.getVal() == end.getVal()) {
                return reconstructPath(parentMap, start, end);
            }

            // Explore neighbors of the current node
            for (GraphNode neighbor : current.getNeighbors()) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parentMap.put(neighbor, current); // Store current node as neighbor's parent
                    queue.offer(neighbor);
                }
            }
        }

        // If the queue becomes empty and 'end' node is not found, no path exists
        return Collections.emptyList();
    }

    // Helper method to reconstruct the path from the parentMap
    private List<Integer> reconstructPath(Map<GraphNode, GraphNode> parentMap, GraphNode start, GraphNode end) {
        List<Integer> path = new LinkedList<>();
        GraphNode current = end;

        // Traverse back from the 'end' node to the 'start' node using parentMap
        while (current != null) {
            path.add(0, current.getVal()); // Add to the beginning to get correct order
            current = parentMap.get(current);
        }

        // Check if the path actually starts with the start node, otherwise it means no path was found
        if (!path.isEmpty() && path.get(0) == start.getVal()) {
            return path;
        }
        return Collections.emptyList(); // No path found
    }

    public static void main(String[] args) {
        ShortestPathUnweightedGraph graphSolver = new ShortestPathUnweightedGraph();

        // Create graph nodes
        GraphNode nodeA = new GraphNode(0);
        GraphNode nodeB = new GraphNode(1);
        GraphNode nodeC = new GraphNode(2);
        GraphNode nodeD = new GraphNode(3);
        GraphNode nodeE = new GraphNode(4);
        GraphNode nodeF = new GraphNode(5);

        // Build graph connections (undirected for simplicity)
        nodeA.addNeighbor(nodeB);
        nodeB.addNeighbor(nodeA);
        nodeA.addNeighbor(nodeC);
        nodeC.addNeighbor(nodeA);

        nodeB.addNeighbor(nodeD);
        nodeD.addNeighbor(nodeB);
        nodeC.addNeighbor(nodeE);
        nodeE.addNeighbor(nodeC);

        nodeD.addNeighbor(nodeE);
        nodeE.addNeighbor(nodeD);
        nodeD.addNeighbor(nodeF);
        nodeF.addNeighbor(nodeD);

        System.out.println("Graph created:");
        // Simple display for graph (not a full traversal, just showing direct neighbors)
        System.out.println("Node " + nodeA.getVal() + " neighbors: " + nodeA.getNeighbors().stream().map(GraphNode::getVal).toList());
        System.out.println("Node " + nodeB.getVal() + " neighbors: " + nodeB.getNeighbors().stream().map(GraphNode::getVal).toList());
        System.out.println("Node " + nodeC.getVal() + " neighbors: " + nodeC.getNeighbors().stream().map(GraphNode::getVal).toList());
        System.out.println("Node " + nodeD.getVal() + " neighbors: " + nodeD.getNeighbors().stream().map(GraphNode::getVal).toList());
        System.out.println("Node " + nodeE.getVal() + " neighbors: " + nodeE.getNeighbors().stream().map(GraphNode::getVal).toList());
        System.out.println("Node " + nodeF.getVal() + " neighbors: " + nodeF.getNeighbors().stream().map(GraphNode::getVal).toList());
        System.out.println(" ");

        // Test cases
        List<Integer> path1 = graphSolver.findShortestPath(nodeA, nodeF);
        System.out.println("Shortest path from " + nodeA.getVal() + " to " + nodeF.getVal() + ": " + (path1.isEmpty() ? "No path" : path1)); // Expected: [0, 1, 3, 5] or [0, 2, 4, 3, 5] (depends on traversal order, but length is same)

        List<Integer> path2 = graphSolver.findShortestPath(nodeA, nodeE);
        System.out.println("Shortest path from " + nodeA.getVal() + " to " + nodeE.getVal() + ": " + (path2.isEmpty() ? "No path" : path2)); // Expected: [0, 2, 4]

        List<Integer> path3 = graphSolver.findShortestPath(nodeA, nodeA);
        System.out.println("Shortest path from " + nodeA.getVal() + " to " + nodeA.getVal() + ": " + (path3.isEmpty() ? "No path" : path3)); // Expected: [0]

        GraphNode nodeG = new GraphNode(6); // Isolated node
        List<Integer> path4 = graphSolver.findShortestPath(nodeA, nodeG);
        System.out.println("Shortest path from " + nodeA.getVal() + " to " + nodeG.getVal() + ": " + (path4.isEmpty() ? "No path" : path4)); // Expected: No path
    }
}
