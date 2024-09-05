package SinglyLinkedList;

public class nthNode {

    private static ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = next;
        }
    }
    public void display(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.print("Null");
    }
    public ListNode findNth_formEnd(int n){
        if(head == null){
            return null;
        }
        if (n <= 0){
            throw new IllegalArgumentException("Invalid value : " + n);
        }
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;
        while(count < n){
            if (refPtr == null){
                throw new IllegalArgumentException( n + "is greater than the number of node list");
            }
            refPtr = refPtr.next;
            count++;
        }
        while(refPtr != null){
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }
        return mainPtr;
    }
    public static void main(String[] args){
        nthNode sll = new nthNode();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);
        ListNode fifth = new ListNode(15);

        sll.head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        sll.display(head);
        System.out.println(" ");

        ListNode nthNodeFromEnd = sll.findNth_formEnd(1);
        System.out.println("Nth node is : " + nthNodeFromEnd.data);
    }
}
