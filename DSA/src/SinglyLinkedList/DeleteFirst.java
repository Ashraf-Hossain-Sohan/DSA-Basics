package SinglyLinkedList;

public class DeleteFirst {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("Null");
    }
    public ListNode deleteFirst(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }
    public static void main (String[] args){
        DeleteFirst sll = new DeleteFirst();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.display();

        sll.deleteFirst();
        System.out.println(" ");

        sll.display();

    }
}
