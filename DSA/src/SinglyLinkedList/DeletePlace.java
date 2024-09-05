package SinglyLinkedList;

public class DeletePlace {

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
    public void delete(int position){
        if(position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
    public static void main (String[] args){
        DeletePlace sll = new DeletePlace();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        sll.display();
        System.out.println(" ");

        sll.delete(3);
        sll.display();
    }
}
