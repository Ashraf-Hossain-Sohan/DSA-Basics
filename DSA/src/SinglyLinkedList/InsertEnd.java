package SinglyLinkedList;

public class InsertEnd {

    private ListNode head;

    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = next;
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
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public static void main (String[] args){
        InsertEnd sll = new InsertEnd();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.display();

        sll.insertLast(20);
        sll.insertLast(56);

        System.out.println(" ");
        sll.display();
    }
}
