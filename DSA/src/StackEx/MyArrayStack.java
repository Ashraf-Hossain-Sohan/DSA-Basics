package StackEx;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyArrayStack {

    private ArrayList<Integer> elements;

    public MyArrayStack() {
        elements = new ArrayList<>();
    }

    public void push(int item) {
        elements.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.remove(elements.size() - 1);
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    public static void main(String[] args) {
        MyArrayStack stack = new MyArrayStack();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        System.out.println("Stack size after pops: " + stack.size());
        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Is stack empty? " + stack.isEmpty());

        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Error: " + e.getMessage() + " - Cannot pop from empty stack.");
        }
    }
}
