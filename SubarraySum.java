package Leetcode;
import java.util.*;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k){
        if(nums == null || nums.length ==0){
            return 0;
        }
        int sum =0, count=0;
        Map<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(sum,1);
        for(int i =0; i < nums.length; i++){
            sum += nums[i];
            if(sumMap.containsKey(sum-k)){
                count += sumMap.get(sum-k);
            }
            sumMap.put(sum,sumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums = {1,-1,0};
        System.out.println(subarraySum(nums,0));
    }
}
