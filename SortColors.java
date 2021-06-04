package Leetcode;

import java.util.Arrays;

public class SortColors {
    public static void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int mid = 0, low =0, high = nums.length-1, pivot = 1;
        while(mid <= high){
            if(nums[mid] < pivot){
                swap(nums,mid,low);
                mid++;
                low++;
            }else if(nums[mid] == pivot){
                mid++;
            }else{
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private static void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(nums));
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
