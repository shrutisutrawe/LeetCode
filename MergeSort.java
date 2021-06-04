package Leetcode;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }
        int low = 0, high = nums.length - 1;
        sort(nums, low, high);
    }

    private static void sort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        sort(nums, low, mid);
        sort(nums, mid + 1, high);
        merge(nums, low, high);
    }

    private static void merge(int[] nums, int low, int high) {
        int mid = (low + high) / 2;
        int[] temp = new int[high - low + 1];
        int k = 0, i = low, j = mid + 1;
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        while (j <= high) {
            temp[k++] = nums[j++];
        }
        i = low;
        for (int a = 0; a < temp.length; a++) {
            nums[i++] = temp[a];
        }
    }

    public static void main(String[] args) {
        int[] nums = {38, 27, 43, 3, 9, 82, 10};
        System.out.println(Arrays.toString(nums));
        mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
