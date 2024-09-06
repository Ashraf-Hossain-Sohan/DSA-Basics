package SinglyLinkedList;

public class RemoveKey {

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
    public void deleteKey(int key){
        ListNode current = head;
        ListNode temp = null;

        if (current != null && current.data == key){
            head = current.next;
            return;
        }
        while(current != null && current.data != key){
            temp = current;
            current = current.next;
        }
        if(current == null){
            return;
        }
        temp.next = current.next;
    }
    public static void main(String[] args){
        RemoveKey sll = new RemoveKey();

        sll.insertLast(1);
        sll.insertLast(1);
        sll.insertLast(10);
        sll.insertLast(10);
        sll.insertLast(16);
        sll.insertLast(17);
        sll.insertLast(19);

        sll.display(head);
        System.out.println(" ");

        sll.deleteKey(17);
        sll.display(head);


    }
}

