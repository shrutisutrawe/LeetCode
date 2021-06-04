package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length ==0 ){
            return intervals;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<int[]> listOfArray = new ArrayList<>();
//        if(intervals.length ==1){
//            listOfArray.add(intervals[0]);
//        }
        listOfArray.add(intervals[0]);
        for(int i =1; i < intervals.length; i++){
            int[] output = new int[2];
            if(listOfArray.get(listOfArray.size()-1)[1] >= intervals[i][0]){
                if(intervals[i][0] < listOfArray.get(listOfArray.size()-1)[0]){
                    output[0] = intervals[i][0];
                }else{
                    output[0] = listOfArray.get(listOfArray.size()-1)[0];
                }
                if(intervals[i][1] > listOfArray.get(listOfArray.size()-1)[1]){
                    output[1] = intervals[i][1];
                }else{
                    output[1] = listOfArray.get(listOfArray.size()-1)[1];
                }
                listOfArray.set(listOfArray.size()-1,output);
            }else{
                listOfArray.add(intervals[i]);
            }
        }
        int[][] finalOutput = new int[listOfArray.size()][2];

        for(int i =0; i < listOfArray.size(); i++){
            finalOutput[i] = listOfArray.get(i);
//            System.out.println(Arrays.toString(finalOutput[i]));
        }
        return finalOutput;
    }
    public static void main(String[] args){
        int[][] intervals = {{1,4},{0,2},{3,5}};
//        int[][] intervals = {{1,3},{2,6},{8,10},{12,15}};
        int[][] out = merge(intervals);
        for(int i =0; i < out.length; i++){
            System.out.println(Arrays.toString(out[i]));
        }
    }
}
