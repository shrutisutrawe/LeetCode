package Leetcode;

public class SearchRotatedArray {
    public static int search(int[] nums, int target) {
        if (nums == null || nums.length == 0 || (nums.length == 1 && target != nums[0])) {
            return -1;
        }
        int i = 0;
        if (target < nums[0]) {
            i = nums.length - 1;
            while (i > 0) {
                if (nums[i] == target) {
                    return i;
                }
                i--;
            }
        } else if (target == nums[0]) {
            return i;
        } else {
            while (i < nums.length) {
                if (nums[i] == target) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    public static int searchWithBinarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0 || (nums.length == 1 && target != nums[0])) {
            return -1;
        }
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] >= nums[low]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else{
                if(target <= nums[high] && target > nums[mid] ){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        System.out.println(searchWithBinarySearch(nums, 2));
    }
}
