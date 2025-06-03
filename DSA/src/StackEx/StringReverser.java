package StackEx;

import java.util.Stack;

public class StringReverser {

    public String reverseString(String s) {
        if (s == null || s.isEmpty()) {
            return s;
        }

        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();

        String s1 = "hello";
        System.out.println("Original: '" + s1 + "', Reversed: '" + reverser.reverseString(s1) + "'");

        String s2 = "programming";
        System.out.println("Original: '" + s2 + "', Reversed: '" + reverser.reverseString(s2) + "'");

        String s3 = "a";
        System.out.println("Original: '" + s3 + "', Reversed: '" + reverser.reverseString(s3) + "'");

        String s4 = "";
        System.out.println("Original: '" + s4 + "', Reversed: '" + reverser.reverseString(s4) + "'");

        String s5 = "madam";
        System.out.println("Original: '" + s5 + "', Reversed: '" + reverser.reverseString(s5) + "'");
    }
}
