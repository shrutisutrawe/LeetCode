package Leetcode;

public class PowerSolution {
    public static double myPow(double x, int n){
        if(x == 0 || n ==1){
            return x;
        }
        if(n == 0){
            return 1;
        }
        if(n < 0){
            x = 1/x;
            n = n * -1;
            System.out.println(n);
        }
        double sq = x*x;
        double result = sq;
        int quo = n/2;
        if(quo < 0){
            quo = quo*-1;
        }
        int rem = n%2;
        System.out.println(quo);
        System.out.println(rem);
        while(quo > 1){
            result *= sq;
            quo--;
        }
        if(rem !=0){
            result *= x;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(myPow(2,-2147483647));
    }
}
