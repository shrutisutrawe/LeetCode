package Leetcode;

public class Add2String {
    public static String addStrings(String num1, String num2){
        String result="";
        StringBuilder tempResult = new StringBuilder();
        int carry =0,sum=0;
        for(int i = num1.length()-1, j= num2.length()-1; i>=0 || j >=0; i--,j--){
            if(j >= 0 && i >= 0) {
                sum = Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(j)));
            }else if(i >= 0 && j <0){
                sum = Integer.parseInt(String.valueOf(num1.charAt(i)));
            }else if(j >= 0 && i < 0){
                sum = Integer.parseInt(String.valueOf(num2.charAt(j)));
            }
            sum += carry;
            carry = sum/10;
            sum = sum%10;
            tempResult.append(sum);
//            System.out.println(result);
            sum =0;
        }
        if(carry != 0){
            tempResult.append(carry);
        }
        result = tempResult.reverse().toString();
        return result;
    }
    public static void main(String[] args){
        String num1 = "999", num2 = "99";
        System.out.println(addStrings(num1,num2));
    }
}
