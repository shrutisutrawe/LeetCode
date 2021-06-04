package Leetcode;

import javafx.scene.layout.Priority;
import javafx.util.Pair;

import java.util.*;

public class ReorganizeStringTemp {
    public static String reorganizeString(String s){
        if(s == null || s.length() ==0){
            return s;
        }
        PriorityQueue<CustomPair> q = new PriorityQueue<>(Collections.reverseOrder());
        CustomPair pair1 = new CustomPair(s.charAt(0),1);
        for(int i = 1; i < s.length(); i++){
            CustomPair tempPair = new CustomPair();
            if(s.charAt(i) == tempPair.getKey()){
                pair1.setValue(tempPair.getValue()+1);
                q.add(pair1);
            }else{
                tempPair.setKey(s.charAt(i));
                tempPair.setValue(1);
                q.add(tempPair);
            }
        }
        char[] tempResultArray = new char[s.length()];
        Iterator iterator = q.iterator();
        while(iterator.hasNext()){
            CustomPair tempPair;
            tempPair = (CustomPair) iterator.next();
            int count = tempPair.getValue();
            char c = tempPair.getKey();
            if(count > (s.length()+1)/2){
                return "";
            }
            int i =0;
            while(i < s.length() && count > 0){
                tempResultArray[i] = c;
                i = i+2;
                count--;
                if(i > s.length()){
                    i = 1;
                }
            }
        }
        return new String(tempResultArray);
    }
    public static void main(String[] args){
        String s = "eeeeaabb";
        System.out.println(reorganizeString(s));
    }
}
