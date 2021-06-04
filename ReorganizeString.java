package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReorganizeString {
    public static String reorganizeString(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), charMap.get(s.charAt(i))+1);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        char[] resultArray = new char[s.length()];
        int strCount = 0;
        for (int i = 0; i < s.length() && strCount != s.length();) {
            char ch = getMaximumValueCharacter(charMap);
            int count = 0;
            if (charMap.get(ch) > (s.length() + 1) / 2) {
                return "";
            }
            while (i < s.length() && count != charMap.get(ch)) {
                resultArray[i] = ch;
                count++;
                strCount++;
                i = i + 2;
                if (i >= s.length()) {
                    i = 1;
                }
            }
            charMap.remove(ch);
            if (i >= s.length()) {
                i = 1;
            }
        }
        return new String(resultArray);
    }

    private static char getMaximumValueCharacter(Map<Character, Integer> hMap) {
        int maxValue = 0;
        char ch = ' ';
        for (Map.Entry<Character, Integer> entry : hMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                ch = entry.getKey();
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        String s = "eeeeaabb";
        System.out.println(reorganizeString(s));
    }
}
