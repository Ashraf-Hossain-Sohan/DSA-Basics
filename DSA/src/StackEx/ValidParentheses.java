package StackEx;

import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        if (s == null || s.isEmpty()) {
            return true;
        }

        Map<Character, Character> mappings = new HashMap<>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (mappings.containsKey(ch)) { // It's a closing bracket
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != mappings.get(ch)) {
                    return false;
                }
            } else { // It's an opening bracket
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validator = new ValidParentheses();

        String s1 = "()[]{}";
        System.out.println("'" + s1 + "' is valid: " + validator.isValid(s1));

        String s2 = "([{}])";
        System.out.println("'" + s2 + "' is valid: " + validator.isValid(s2));

        String s3 = "([)]";
        System.out.println("'" + s3 + "' is valid: " + validator.isValid(s3));

        String s4 = "{[]}";
        System.out.println("'" + s4 + "' is valid: " + validator.isValid(s4));

        String s5 = "(";
        System.out.println("'" + s5 + "' is valid: " + validator.isValid(s5));

        String s6 = "())";
        System.out.println("'" + s6 + "' is valid: " + validator.isValid(s6));

        String s7 = "";
        System.out.println("'" + s7 + "' is valid: " + validator.isValid(s7));
    }
}
