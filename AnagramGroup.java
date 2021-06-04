package Leetcode;
import java.lang.reflect.Array;
import java.util.*;

public class AnagramGroup {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return null;
        }
        List<List<String>> output = new ArrayList<>();
        Map<String,ArrayList<String>> stringMap = new HashMap<>();
        int[] charArray = new int[26];
        for(int i =0 ; i < strs.length; i++){
            for(int j =0; j < strs[i].length(); j++){
                charArray[strs[i].charAt(j) - 'a']++;
            }
            String str = Arrays.toString(charArray);
            if(stringMap.containsKey(str)){
                stringMap.get(str).add(strs[i]);
            }else {
                System.out.println(Arrays.toString(charArray));
                stringMap.put(str,new ArrayList<String>(Collections.singleton(strs[i])));
            }
            charArray = new int[26];
        }
        for(Map.Entry<String,ArrayList<String>> entry : stringMap.entrySet()){
            output.add(entry.getValue());
//            System.out.println(output.toString());
        }
        return output;
    }

    public static void main(String[] args){
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strings).toString());
    }
}
