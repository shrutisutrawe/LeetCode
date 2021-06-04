package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {
    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int minutes = 0;
        int freshCount = 0;
        Queue<int[]> rottenq = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    rottenq.add(new int[]{i,j});
                }else if(grid[i][j] == 1){
                    freshCount++;
                }
            }
        }
        if(freshCount == 0){
            return 0;
        }
        rottenq.add(null);
        int row = 0,column = 0;
        while(!rottenq.isEmpty()){
            int[] removedOrange = rottenq.remove();
            if(removedOrange == null){
                if(!rottenq.isEmpty()){
                    rottenq.add(null);
                }else{
                    break;
                }
                minutes++;
                continue;
            }
            row = removedOrange[0];
            column = removedOrange[1];
            if (column + 1 < grid[0].length && grid[row][column + 1] == 1) {
                grid[row][column + 1] = 2;
                rottenq.add(new int[]{row,column+1});
                freshCount--;
            }
            if (column - 1 >= 0 && grid[row][column - 1] == 1) {
                grid[row][column - 1] = 2;
                rottenq.add(new int[]{row,column-1});
                freshCount--;
            }
            if (row + 1 < grid.length && grid[row + 1][column] == 1) {
                grid[row + 1][column] = 2;
                rottenq.add(new int[]{row+1,column});
                freshCount--;
            }
            if (row - 1 >= 0 && grid[row - 1][column] == 1) {
                grid[row - 1][column] = 2;
                rottenq.add(new int[]{row-1,column});
                freshCount--;
            }

        }
        if(minutes == 0 || freshCount != 0){
            return -1;
        }
        return minutes;
    }

    public static void main(String[] args){
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }

}
