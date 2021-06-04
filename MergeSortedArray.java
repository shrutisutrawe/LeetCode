package Leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public static void mergeSortedArray(int[] nums1, int m, int[] nums2, int n) {
        if (nums2 == null || n == 0) {
            return;
        }
        int k = nums1.length-1, i = m-1, j = n-1;

        while (k >=0) {
            if(j < 0){
                break;
            }
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 4, 5, 6, 0};
        int[] nums2 = {3};
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        mergeSortedArray(nums1, 5, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}
