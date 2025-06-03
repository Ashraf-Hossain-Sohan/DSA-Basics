package QueueEx;

import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueueExample {

    public static void main(String[] args) {
        Queue<String> customers = new LinkedList<>();

        System.out.println("Is queue empty? " + customers.isEmpty());

        customers.offer("Alice");
        customers.offer("Bob");
        customers.offer("Charlie");

        System.out.println("Queue after offers: " + customers);
        System.out.println("Is queue empty? " + customers.isEmpty());

        System.out.println("Next customer (peek): " + customers.peek());
        System.out.println("Queue after peek: " + customers);

        String servedCustomer1 = customers.poll();
        System.out.println("Served: " + servedCustomer1);
        System.out.println("Queue after first poll: " + customers);

        String servedCustomer2 = customers.poll();
        System.out.println("Served: " + servedCustomer2);
        System.out.println("Queue after second poll: " + customers);

        System.out.println("Queue size: " + customers.size());

        String servedCustomer3 = customers.poll();
        System.out.println("Served: " + servedCustomer3);
        System.out.println("Queue after third poll: " + customers);

        System.out.println("Is queue empty? " + customers.isEmpty());

        String servedCustomer4 = customers.poll();
        System.out.println("Attempt to poll from empty queue: " + servedCustomer4);
    }
}
