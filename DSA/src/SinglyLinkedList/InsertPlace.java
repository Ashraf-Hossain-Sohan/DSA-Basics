package SinglyLinkedList;

public class InsertPlace {

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
    public void insert(int position, int value){
        ListNode node = new ListNode(value);

        if (position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1;

            while(count < position - 1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = node;
            node.next = current;
        }
    }
    public static void main (String[] args){
        InsertPlace sll = new InsertPlace();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);

        sll.head.next = second;
        second.next = third;

        sll.display();
        System.out.println(" ");

        sll.insert(4,11);
        sll.display();
    }
}
