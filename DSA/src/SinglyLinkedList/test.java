package SinglyLinkedList;

import java.util.Scanner;


public class test {


    static void cal(int amount , char hello){

        double vat;

        if( hello == 'F'){

        }
        if( hello == 'C'){

        }
        if (amount < 1000){
            vat = amount * 0.10;
            System.out.println("your vat is " + vat);
            System.out.println("your total is " + (vat+amount));

        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


//        int amount = input.nextInt();
//        char a = input.next().charAt(0);

        int n = 4;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= n ; j++){
                System.out.print(i + 20 +" ");
            }
            System.out.println(" ");
        }

//        cal(amount,a);

//        System.out.println(amount);
    }
}
