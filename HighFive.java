package Leetcode;
import java.util.*;

public class HighFive {
    public static int[][] highFive(int[][] items){
        if(items == null || items.length == 0){
            return items;
        }
//        Arrays.sort(items,(a,b) -> Integer.compare(a[0],b[0]));
//        for(int i =0; i < items.length; i++){
//            System.out.println(Arrays.toString(items[i]));
//        }

        Map<Integer,List<Integer>> studentMarks = new HashMap<>();
        for(int i =0; i < items.length; i++){
            List<Integer> marks = new ArrayList<>();
            if(studentMarks.containsKey(items[i][0])){
                marks = studentMarks.get(items[i][0]);
                marks.add(items[i][1]);
            }else{
                studentMarks.put(items[i][0],new ArrayList<>(items[i][1]));
            }
        }
//        int temp = 0;
//        for(Map.Entry<Integer,List<Integer>> entry : studentMarks.entrySet()){
//            List<Integer> tempMarks = new ArrayList<>();
//            tempMarks= entry.getValue();
//            int[] marksArray = new int[tempMarks.size()];
//            Arrays.sort(tempMarks.toArray());
//            for(int i = marksArray.length-1; )
//
//        }
//        int temp = items[0][0];
//        for(int i =0;i < items.length; i++){
//            if(items[i][0] != temp){
//                temp = items[i][0];
//            }
//            else{
//                marks.add
//            }
//        }
        return items;
    }
    public static void main(String[] args){
        int[][] items = {{1,91},{1,92},{2,93},{2,97},{1,60},{2,77},{1,65},{1,87},{1,100},{2,100},{2,76}};
//        for(int i =0; i < items.length; i++){
//            System.out.println(Arrays.toString(items[i]));
//        }
        highFive(items);
    }
}
