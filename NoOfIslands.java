package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfIslands {
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int maxRow = grid.length, maxColumn = grid[0].length;
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '2';
                    bfs(grid, i, j, maxRow, maxColumn);
                    count++;
                }
            }
        }
        return count;
    }

    private static void bfs(char[][] grid, int i, int j, int maxRow, int maxColumn) {
        ArrayList<Integer> tempList = new ArrayList<>();
        Queue<List<Integer>> neighborQueue = new LinkedList<>();
        tempList.add(i);
        tempList.add(j);
        neighborQueue.add(tempList);
        int row, column;
        List<Integer> removedNeighbor;
        while (!neighborQueue.isEmpty()) {
            removedNeighbor = neighborQueue.remove();
            row = removedNeighbor.get(0);
            column = removedNeighbor.get(1);
            if (column + 1 < maxColumn && grid[row][column + 1] == '1') {
                grid[row][column + 1] = '2';
                ArrayList<Integer> tempList1 = new ArrayList<>();
                tempList1.add(row);
                tempList1.add(column+1);
                neighborQueue.add(tempList1);
            }
            if (column - 1 >= 0 && grid[row][column - 1] == '1') {
                grid[row][column - 1] = '2';
                ArrayList<Integer> tempList1 = new ArrayList<>();
                tempList1.add(row);
                tempList1.add(column-1);
                neighborQueue.add(tempList1);
            }
            if (row + 1 < maxRow && grid[row + 1][column] == '1') {
                grid[row + 1][column] = '2';
                ArrayList<Integer> tempList1 = new ArrayList<>();
                tempList1.add(row+1);
                tempList1.add(column);
                neighborQueue.add(tempList1);
            }
            if (row - 1 >= 0 && grid[row - 1][column] == '1') {
                grid[row - 1][column] = '2';
                ArrayList<Integer> tempList1 = new ArrayList<>();
                tempList1.add(row-1);
                tempList1.add(column);
                neighborQueue.add(tempList1);
            }
        }
    }

    public static void main(String[] args) {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        System.out.println(numIslands(grid));
    }
}
