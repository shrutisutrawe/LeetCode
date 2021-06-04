package Leetcode;

public class KthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int low =0, high = nums.length-1;
        quickSort(nums,low,high);
        return nums[high - k+1];
    }
    private static void quickSort(int[] nums, int low, int high){
        int pivot =0;
        if(low < high){
            pivot = partition(nums,low, high);
            quickSort(nums,low,pivot-1);
            quickSort(nums,pivot+1,high);
        }
    }
    private static int partition(int nums[], int low, int high){
        int pivot = nums[high];
        int i = low -1;
        for(int j = low; j <= high; j++){
            if(nums[j] < pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums,i+1,high);
        return (i+1);
    }
    private static void swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args){
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2 ));
    }

}
