package Leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        if(nums == null || nums.length ==0){
            return nums;
        }
        int[] output = new int[nums.length];
        int previousValue = 1;
        int tempValue = 1;
        for(int i =0; i < nums.length; i++){
            tempValue *= previousValue;
            previousValue = nums[i];
            output[i] = tempValue;
        }
        previousValue =1;
        tempValue =1;
//        System.out.println(Arrays.toString(leftElementArray));
        for(int i =nums.length-1; i >=0; i--){
            tempValue *= previousValue;
            previousValue = nums[i];
            nums[i] = tempValue;
        }
//        System.out.println(Arrays.toString(output));
        for(int i =0; i < nums.length; i++){
            output[i] = output[i]*nums[i];
        }
//        System.out.println(Arrays.toString(output));
        return output;
    }
    public static void main(String[] args){
        int[] nums = {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
