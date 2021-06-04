package Leetcode;

public class MaxSubarray {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return nums[0];
        }

        int maxSum = Integer.MIN_VALUE, currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum < nums[i]) {
                currentSum = nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;

            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
}
