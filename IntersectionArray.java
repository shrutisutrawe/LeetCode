package Leetcode;
import java.util.*;
public class IntersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0){
            return null;
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> tempOut = new HashSet<>();
        for(int i =0 ;i < nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i =0; i < nums2.length;i++){
            if(set1.contains(nums2[i])){
                tempOut.add(nums2[i]);
            }
        }
        int[] out = new int[tempOut.size()];
        int j =0;
        for(int i : tempOut){
            out[j++] = i;
        }
        return out;
    }
    public static void main(String[] args){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
