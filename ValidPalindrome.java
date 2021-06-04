package Leetcode;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        for(int front = 0, back = s.length()-1; back > front;){
            char lowerCharFront = Character.toLowerCase(s.charAt(front));
            char lowerCharBack = Character.toLowerCase(s.charAt(back));
            if(!validation(lowerCharFront)){
                front ++;
                continue;
            }
            if(!validation(lowerCharBack)){
                back--;
                continue;
            }
            if(lowerCharFront != lowerCharBack){
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
    private static boolean validation(char ch){
        if((ch >='0' && ch <= '9') || (ch >='a' && ch <='z')){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String s = "Marge, let's \\\"[went].\\\" I await {news} telegram.";
        System.out.println(isPalindrome(s));
    }
}
