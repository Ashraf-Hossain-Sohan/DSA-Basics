package TypeOfLists;

public class SinglyLinkedList {

    private static ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //printing the singly linked list
    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + "--> ");
            current = current.next;
        }
        System.out.print("Null");
    }
    //count the singly linked list
    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head ;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    //add a new node at the beginning the singly linked list
    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    //add a new node at the end of the singly linked list
    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
            return;
        }
        ListNode current = head;
        while(null != current.next){
            current = current.next;
        }
        current.next = newNode;
    }
    //insert new value in any position in the linked list
    public void insert(int position , int value){
        ListNode node = new ListNode(value);
        if (position == 1){
            node.next = head;
            head = node;
        }else{
            ListNode previous = head;
            int count = 1 ;
            while(count < position -1){
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }
    //delete first node of a singly linked list
    public ListNode deleteFirst(){
        if (head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }
    //delete last node of a singly linked list
    public ListNode deleteLast(){
        if (head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }
    //delete value in any position in the linked list
    public void delete(int position){
        if (position == 1){
            head = head.next;
        }else{
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }
    //Search an element in a singly linked list
    public static boolean find(ListNode head, int searchKey){
        if (head == null){
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
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();

//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(1);
//        ListNode third = new ListNode(8);
//        ListNode forth = new ListNode(11);
//        ListNode f5 = new ListNode(18);
//
//        sll.head.next = second; //10 --> 1
//        second.next = third;    //10 --> 1 --> 8
//        third.next = forth;     //10 --> 1 --> 8 --> 11
//        forth.next = f5;        //10 --> 1 --> 8 --> 11 --> 18

        sll.insertFirst(11);
        sll.insertFirst(8);
        sll.insertFirst(1);
        sll.insertFirst(10);

        sll.insertLast(18);

        sll.insert(2,5);

//        sll.deleteFirst();
//        sll.deleteLast();
//        sll.delete(2);

        if (SinglyLinkedList.find(head , 100)){
            System.out.println("search key found....");
        }else{
            System.out.println("search key not in list found....");
        }

        sll.display();
        System.out.println(" ");
        System.out.println("length is " + sll.length());
    }
}
