package SinglyLinkedList;

public class InsertInSorted {

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
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("Null");
    }
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    public ListNode insertInSortedList(int value){
        ListNode newNode = new ListNode(value);

        if(head == null){
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while(current != null && current.data < newNode.data){
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args){
        InsertInSorted sll = new InsertInSorted();

        sll.insertLast(1);
        sll.insertLast(1);
        sll.insertLast(10);
        sll.insertLast(10);
        sll.insertLast(16);
        sll.insertLast(17);
        sll.insertLast(19);

        sll.display(head);
        System.out.println(" ");

        sll.insertInSortedList(11);
        sll.display(head);

    }
}
