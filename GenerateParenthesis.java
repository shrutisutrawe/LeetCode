package Leetcode;
import java.util.*;

public class GenerateParenthesis {
    public static List<String> output = new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        int openCount = 0, closeCount = 0;
        String tempOut = "";
        generateParenthesisRecursion(tempOut,n,openCount,closeCount);
        return output;
    }
    private static void generateParenthesisRecursion(String s, int n, int open, int close){
        if(s.length() == 2*n){
            output.add(s);
            return;
        }
        for(int i =0; i < 2; i++){
            if(i ==0 && open < n){
                generateParenthesisRecursion(s+'(',n,open+1,close);
            }else if(i==1 && close < open){
                generateParenthesisRecursion(s+')',n,open,close+1);
            }
        }
        return;
    }
    public static void main(String[] args){
        System.out.println(generateParenthesis(3));
    }
}
