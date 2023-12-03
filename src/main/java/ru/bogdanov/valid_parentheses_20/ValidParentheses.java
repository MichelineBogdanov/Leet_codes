package ru.bogdanov.valid_parentheses_20;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * - Open brackets must be closed by the same type of brackets.
 * - Open brackets must be closed in the correct order.
 * - Every close bracket has a corresponding open bracket of the same type.
 * ---
 * Example 1:
 * Input: s = "()"
 * Output: true
 * ---
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * ---
 * Example 3:
 * Input: s = "(]"
 * Output: false
 */

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()[]{}"));
    }

    public boolean isValid(String s) {
        if (s.isEmpty() || s.length() == 1) {
            return false;
        }
        Stack<Character> bracketsStack = new Stack<>();
        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (c == '{' || c == '[' || c == '(') {
                bracketsStack.add(c);
            } else if ((c == '}' || c == ']' || c == ')') && bracketsStack.isEmpty()) {
                return false;
            } else if ((c == '}' && bracketsStack.peek() == '{')
                    || (c == ']' && bracketsStack.peek() == '[')
                    || (c == ')' && bracketsStack.peek() == '(')) {
                bracketsStack.pop();
            } else {
                return false;
            }
        }
        return bracketsStack.isEmpty();
    }

}
