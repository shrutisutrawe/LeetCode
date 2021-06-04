package Leetcode;

public class SearchMatrixII {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        if(row < 0){
            return false;
        }
        while(row >=0 && col < matrix[0].length){
            if(target < matrix[row][col]){
                row--;
            }else if(target > matrix[row][col]){
                col++;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,4},{2,5}};
        System.out.println(searchMatrix(matrix,3));
    }
}
