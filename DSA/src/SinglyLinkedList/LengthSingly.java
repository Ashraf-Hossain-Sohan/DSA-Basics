package SinglyLinkedList;

import java.util.List;

public class LengthSingly {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = next;
        }
    }

    public int length(){
        if (head == null){
            return 0 ;
        }
        int count = 0;
        ListNode current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main (String[] args){
        LengthSingly sll = new LengthSingly();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode forth = new ListNode(11);

        sll.head.next = second;
        second.next = third;
        third.next = forth;

        System.out.println("Length is " + sll.length());
    }
}
