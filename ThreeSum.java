package Leetcode;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0 || nums.length ==1){
            return result;
        }
        Set<List<Integer>> tempResultSet = new HashSet<>();
        int  k = 0,i =0,j=0;
        Arrays.sort(nums);
        while(k < nums.length-2){
            i = k+1;
            j = nums.length -1;
            while( i < j && j > i){
                if(nums[i] + nums[j] < 0 - nums[k]){
                    i++;
                }else if(nums[i] + nums[j] == 0 - nums[k]){
                    List<Integer> triplets = new ArrayList<>();
                    triplets.add(nums[k]);
                    triplets.add(nums[i]);
                    triplets.add(nums[j]);
                    tempResultSet.add(triplets);
                    int temp1 = nums[i];
                    i++;
                    while(i < nums.length-1 && nums[i] == temp1){
                        temp1 = nums[i];
                        i++;
                    }
                }else if(nums[i] + nums[j] > 0 - nums[k]){
                    int temp2 = nums[j];
                    j--;
                    while(j > i && nums[j] == temp2){
                        temp2 = nums[j];
                        j--;
                    }
                }
            }
            int temp3 = nums[k];
            k++;
            while(k < nums.length-2 && nums[k] == temp3){
                temp3 = nums[k];
                k++;
            }
        }
        result.addAll(tempResultSet);
        return result;
    }
    public static void main(String[] args){
        int[] nums = {0,0,0,0};
        System.out.println(threeSum(nums));
    }
}
