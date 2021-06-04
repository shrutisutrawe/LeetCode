package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return null;
        }
        int i = 0, j = 0, maxRow = matrix.length -1, maxColumn = matrix[0].length-1, minRow = 0, minColumn = 0;

        int totalCount = (maxRow+1) * (maxColumn+1);
        int totFinalCount =0;
        List<Integer> result = new ArrayList<>();
        while (totFinalCount < totalCount) {
            for(j = minColumn; j <= maxColumn && totFinalCount < totalCount; j++) {
                result.add(matrix[i][j]);
                totFinalCount++;
            }
            j = maxColumn;
            minRow++;
            for(i = minRow; i <= maxRow && totFinalCount < totalCount; i++) {
                result.add(matrix[i][j]);
                totFinalCount++;
            }
            i = maxRow;
            maxColumn--;
            for (j = maxColumn; j >= minColumn && totFinalCount < totalCount; j--) {
                result.add(matrix[i][j]);
                totFinalCount++;
            }
            j = minColumn;
            maxRow--;
            for(i = maxRow; i >= minRow && totFinalCount < totalCount; i--) {
                result.add(matrix[i][j]);
                totFinalCount++;
            }
            i = minRow;
            minColumn++;
        }
        return result;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix));
    }
}


