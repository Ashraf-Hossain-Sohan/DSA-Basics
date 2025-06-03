package StackEx;

import java.util.Stack;

public class BasicParenthesesBalancer {

    public boolean isBalanced(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BasicParenthesesBalancer balancer = new BasicParenthesesBalancer();

        String s1 = "()(())";
        System.out.println("'" + s1 + "' is balanced: " + balancer.isBalanced(s1));

        String s2 = "(()";
        System.out.println("'" + s2 + "' is balanced: " + balancer.isBalanced(s2));

        String s3 = ")(";
        System.out.println("'" + s3 + "' is balanced: " + balancer.isBalanced(s3));

        String s4 = "";
        System.out.println("'" + s4 + "' is balanced: " + balancer.isBalanced(s4));

        String s5 = "((()))";
        System.out.println("'" + s5 + "' is balanced: " + balancer.isBalanced(s5));

        String s6 = "())";
        System.out.println("'" + s6 + "' is balanced: " + balancer.isBalanced(s6));
    }
}
