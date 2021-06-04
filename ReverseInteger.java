package Leetcode;

public class ReverseInteger {
    public static int reverseInteger(int x){
        if(x == 0){
            return x;
        }
        String tempResult = "";
        int n = x;
        if(n < 0){
            tempResult +='-';
            n *= -1;
        }
        while(n !=0){
            int rem = n%10;
            tempResult += rem;
            n = n/10;
        }
        double base = 2, exp = 31;
        long result = Long.parseLong(tempResult);
        if(result < -2147483648 || result > 2147483647){
            return 0;
        }
        return Integer.parseInt(tempResult);
    }
    public static void main(String[] args){
        System.out.println(reverseInteger(-2147483648));
    }
}
