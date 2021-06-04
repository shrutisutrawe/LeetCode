package Leetcode;
import java.util.*;

public class MeetingRoom1 {
    public static boolean canAttendMeetings(int[][] intervals){
        if(intervals.length == 0){
            return true;
        }
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        for(int i =0; i < intervals.length-1; i++){
            if(intervals[i][1] > intervals[i+1][0]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[][] intervals = {{0,30},{15,20},{10,12}};
        System.out.println(canAttendMeetings(intervals));
    }
}
