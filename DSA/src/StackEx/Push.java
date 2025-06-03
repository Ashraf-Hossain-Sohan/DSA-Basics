package StackEx;

import java.util.Stack;

public class Push {

    public static void main(String[] args) {
        
        Stack<String> books = new Stack<>();

        System.out.println("Is the stack empty? " + books.empty()); 

        
        books.push("The Great Gatsby");
        books.push("1984");
        books.push("To Kill a Mockingbird");

        System.out.println("Stack after pushes: " + books);
        System.out.println("Is the stack empty? " + books.empty());
        System.out.println("Top element (peek): " + books.peek()); 
        System.out.println("Stack after peek: " + books); 

        String removedBook1 = books.pop();

        System.out.println("Popped: " + removedBook1);
        System.out.println("Stack after first pop: " + books); 

        String removedBook2 = books.pop();
        System.out.println("Popped: " + removedBook2); 
        System.out.println("Stack after second pop: " + books); 

        System.out.println("Stack size: " + books.size()); 

        String removedBook3 = books.pop();
        System.out.println("Popped: " + removedBook3); 
        System.out.println("Stack after third pop: " + books); 

        System.out.println("Is the stack empty? " + books.empty()); 

        // Trying to pop from an empty stack will throw EmptyStackException
        /*try {
            books.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception: Cannot pop from an empty stack!");
        }*/
    }
}