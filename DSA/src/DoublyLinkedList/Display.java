package DoublyLinkedList;

public class Display {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Display(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public void displayForward(){
        if(head == null){
            return;
        }

        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void displayBackward(){
        if(tail == null){
            return;
        }
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("Null");
    }
    public static void main (String[] args) {
        Display dll = new Display();

        dll.insertLast(1);
        dll.insertLast(2);
        dll.insertLast(3);
        dll.insertLast(4);

        dll.displayBackward();
        dll.displayForward();
    }
}
