package Leetcode;

public class DecodeWays {
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int currentCount = 0, prevOneCount = 0, prevTwoCount = 0;
        if (s.charAt(0) != '0') {
            currentCount = prevOneCount = prevTwoCount = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            currentCount = 0;
            int twoDigit = (s.charAt(i-1) - '0')*10 + (s.charAt(i) - '0');
            if(s.charAt(i) != '0'){
                currentCount = prevOneCount;
            }
            if(twoDigit >=10 && twoDigit <=26){
                currentCount += prevTwoCount;
            }
            prevTwoCount = prevOneCount;
            prevOneCount = currentCount;
        }
        return prevOneCount;
    }

    public static void main(String[] args) {
        String s = "123123";
        System.out.println(numDecodings(s));
    }
}
