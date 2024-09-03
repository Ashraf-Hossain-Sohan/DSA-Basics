package SinglyLinkedList;

public class InsertBeginning {

    private ListNode head;

    private static class ListNode{
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
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public static void main (String[] args){
        InsertBeginning sll = new InsertBeginning();

//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode forth = new ListNode(11);
//
//        sll.head.next = second;
//        second.next = third;
//        third.next = forth;

        sll.insertFirst(11);

        sll.display();
    }
}
