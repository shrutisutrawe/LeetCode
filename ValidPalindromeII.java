package Leetcode;

public class ValidPalindromeII {
    public static boolean validPalindrome(String s) {
        if(s == null || s.length() == 0){
            return false;
        }
        int maxDelete = 1;
        for(int front = 0, back = s.length()-1; front < back;){
            if(s.charAt(front) != s.charAt(back)){
                return (isPalindrome(s,front,back-1) || isPalindrome(s,front+1,back));
            }
            front++;
            back--;
        }
        return true;
    }
    private static boolean isPalindrome(String s, int front, int back){
        for(int i = front,j = back; i < j;i++,j--){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String s = "ebcbbececabbacecbbcbe";
        System.out.println(validPalindrome(s));
    }
}
