package Leetcode;

import java.util.Arrays;

public class LongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.trim().length() == 0 || s.length() == 1) {
            return 1;
        }
        int[] subString = new int[256];
        Arrays.fill(subString, -1);
        int i, start = 0, max = 0,index = 0 ;
        for (i = 0; i < s.length(); i++) {
            index = (int)s.charAt(i);
            if (subString[index] == -1) {
                subString[index] = i;
            } else {
                if (subString[index] > start) {
                    if (max < (i - start)) {
                        max = i - start;
                    }
                    start = subString[index] + 1;
                }
                subString[index] = i;
            }
        }
        if (max < i - start) {
            max = i - start;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "  au";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
