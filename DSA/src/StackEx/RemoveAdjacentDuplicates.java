package StackEx;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

    public String removeDuplicates(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) { // Iterating directly over Stack (extends Vector)
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        RemoveAdjacentDuplicates remover = new RemoveAdjacentDuplicates();

        String s1 = "abbaca";
        System.out.println("Original: '" + s1 + "', After removal: '" + remover.removeDuplicates(s1) + "'");

        String s2 = "azxxzy";
        System.out.println("Original: '" + s2 + "', After removal: '" + remover.removeDuplicates(s2) + "'");

        String s3 = "acccba";
        System.out.println("Original: '" + s3 + "', After removal: '" + remover.removeDuplicates(s3) + "'"); // aacccba -> aaba -> ba

        String s4 = "abccba";
        System.out.println("Original: '" + s4 + "', After removal: '" + remover.removeDuplicates(s4) + "'"); // abccba -> abba -> aa -> ""

        String s5 = "a";
        System.out.println("Original: '" + s5 + "', After removal: '" + remover.removeDuplicates(s5) + "'");

        String s6 = "";
        System.out.println("Original: '" + s6 + "', After removal: '" + remover.removeDuplicates(s6) + "'");
    }
}
