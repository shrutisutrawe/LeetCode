package Leetcode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0 || strs.length == 1) {
            return strs[0];
        }
        String out = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(out) != 0){
                out = out.substring(0,out.length()-1);
            }
            if(out.isEmpty()){
                return "";
            }
        }
        return out;
//        int j =0,minLength = strs[0].length();
//        for(int i =0 ; i < strs.length; i++){
//            if(strs[i].length() <= minLength){
//                minLength = strs[i].length();
//            }
//        }
//        while(j < minLength){
//            for(int i =1; i < strs.length && j < strs[i].length(); i++){
//                if(strs[i].charAt(j) == strs[i-1].charAt(j)){
//                    continue;
//                }else{
//                    return out;
//                }
//            }
//            out += strs[0].charAt(j);
//            j++;
//        }
    }

    public static void main(String[] args) {
        String[] s = {"ab", "a"};
//        String myStr = "Hello planet earth, you are a great planet.";
//        System.out.println(myStr.lastIndexOf("planet"));
        System.out.println(longestCommonPrefix(s));
    }
}
