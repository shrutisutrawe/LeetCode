package Leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Stack<Character> storeParentheses = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                storeParentheses.push(s.charAt(i));
            }else if (!storeParentheses.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}')) {
                if (s.charAt(i) == ')' && storeParentheses.peek() == '(') {
                    storeParentheses.pop();
                } else if (s.charAt(i) == ']' && storeParentheses.peek() == '[') {
                    storeParentheses.pop();
                } else if (s.charAt(i) == '}' && storeParentheses.peek() == '{') {
                    storeParentheses.pop();
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return storeParentheses.isEmpty();
    }
    public static void main(String[] args){
        String s = "(";
        System.out.println(isValid(s));
    }
}
