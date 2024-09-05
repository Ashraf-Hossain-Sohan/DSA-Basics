package SinglyLinkedList;

public class SearchElement {

    private static ListNode head;

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
    public boolean find(ListNode head,int searchKey){
        if(head == null){
            return false;
        }
        ListNode current = head;
        while(current != null){
            if (current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public static void main (String[] args){
        SearchElement sll = new SearchElement();

        head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);
        ListNode fifth = new ListNode(20);

        head.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        sll.display();
        System.out.println(" ");
        if (sll.find(head,20)){
            System.out.println("item found...");
        }else {
            System.out.println("item is not in the list");
        }
    }
}
