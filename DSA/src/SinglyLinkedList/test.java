package SinglyLinkedList;

public class test {
    static void hello(){

        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

    }
    static void sum(int x,double y){
        System.out.println("the sum is " + (x+y));
        System.out.println("the sub is " + (x-y));
        System.out.println("the mul is " + (x*y));
        System.out.println(" ");
    }
    static void sum(int x,double y,int z){
        System.out.println("the sum is " + (x+y));
        System.out.println("the sub is " + (x-y));
        System.out.println("the mul is " + (x*y));
        System.out.println(" ");
    }
    static void sum(int x,double y,int z,int a){
        System.out.println("the sum is " + (x+y));
        System.out.println("the sub is " + (x-y));
        System.out.println("the mul is " + (x*y));
        System.out.println(" ");
    }
    static int onevar(int x){
        return x + 10;
    }
    static void check(int age){
        if (age < 18){
            System.out.println("18");
        } else if (age == 18) {
            System.out.println("your good");
        } else if (age > 18) {
            System.out.println("your old");
        } else {
            System.out.println("your dead");
        }
    }
    static void check(String name ,int age){
        if (age < 18){
            System.out.println("18");
        } else if (age == 18) {
            System.out.println("your good");
        } else if (age > 18) {
            System.out.println("your old");
        } else {
            System.out.println("your dead");
        }
    }
    public static void main(String[] args) {

        int x = 80;
        int x1;
    hello();
    sum(10,20.0);
        sum(100,20);
        sum(10,90);
        sum(10,40);
        sum(100,80);

        check(89);
        check("ash",34);
    }
}
