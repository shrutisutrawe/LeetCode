package Leetcode;

public class StringCompress {
    public static int compress(char[] chars){
        if(chars == null || chars.length == 0){
            return 0;
        }
        String s ="";
        char temp = chars[0];
        int count=1;
        for(int i =1; i < chars.length; i++){
            if(temp == chars[i]){
                count++;
            }else{
                if(count > 1){
                    s += temp;
                    s += count;
                    count = 0;
                }else{
                    s += temp;
                    count =0;
                }
            }
            temp = chars[i];
        }
        if(count > 1){
            s += count;
        }
        System.out.println(s);
        return s.length();
    }
    public static void main(String[] args){
        char[] c = {'a','a','b','b','c','c','c'};
        System.out.println(compress(c));
    }
}
