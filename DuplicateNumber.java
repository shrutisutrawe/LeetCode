package Leetcode;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]);
            if (nums[val] < 0) return val;
            nums[val] *= -1;
        }
        return 0;
    }

    public static int findDuplicate2(int[] nums) {
        int tortoise = nums[0];
        int hare = nums[0];
        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);
        tortoise = nums[0];
        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }
        return hare;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 3, 2, 1};
        System.out.println(findDuplicate2(nums));
    }
}
