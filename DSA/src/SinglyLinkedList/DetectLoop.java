package SinglyLinkedList;

public class DetectLoop {
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
    public boolean containsLoop(){
        ListNode fastPrt = head;
        ListNode slowPrt = head;

        while(fastPrt != null && fastPrt.next != null){
            fastPrt = fastPrt.next.next;
            slowPrt = slowPrt.next;

            if (slowPrt == fastPrt){
                return true;
            }
        }
        return false;
    }
    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }
    public static void main(String[] args){
        DetectLoop sll = new DetectLoop();

        sll.createALoopInLinkedList();
//        sll.display(head);
        System.out.println(sll.containsLoop());

    }
}
