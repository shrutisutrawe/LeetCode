package Leetcode;

public class MinimumRemoveParentheses {
    public static String minRemoveToMakeValid(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        StringBuilder tempOutput = new StringBuilder();
        StringBuilder finalOutput = new StringBuilder();
        int openingCounter = 0, openCloseCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openingCounter++;
                openCloseCounter++;
            }
            if (s.charAt(i) == ')') {
                if (openCloseCounter == 0)
                    continue;
                openCloseCounter--;
            }
            tempOutput.append(s.charAt(i));
        }
        int finalOpeningCounter = openingCounter - openCloseCounter;
        for (int i = 0; i < tempOutput.length(); i++) {
            if (tempOutput.charAt(i) == '(') {
                finalOpeningCounter--;
                if (finalOpeningCounter < 0) {
                    continue;
                }
            }
            finalOutput.append(tempOutput.charAt(i));
        }
        return finalOutput.toString();
    }

    public static void main(String[] args) {
        String s = "())()(((";
        System.out.println(s);
        String out = minRemoveToMakeValid(s);
        System.out.println("out:" + out);
    }
}
