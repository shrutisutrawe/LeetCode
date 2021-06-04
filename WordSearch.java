package Leetcode;

import java.sql.SQLOutput;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0){
            return false;
        }
        int count =0;
        boolean result = false;
        for(int i  = 0; i < board.length; i++){
            for( int j = 0; j < board[0].length; j++){
                if(board[i][j] == word.charAt(count)){
                    if(word.length() == 1){
                        return true;
                    }
                    result = dfsWordSearch(board,i,j,board.length, board[0].length,count,word);
                    if(result){
                        return result;
                    }else{
                        continue;
                    }
                }
            }
        }
        return result;
    }
    private static boolean dfsWordSearch(char[][] board, int row, int column, int maxRow, int maxColumn, int count, String word){
        if(count == word.length()){
            return true;
        }
        if(row < 0 || column < 0 || row >= maxRow || column >= maxColumn || count > word.length() || word.charAt(count) != board[row][column]){
            return false;
        }
        char tempChar = board[row][column];
        System.out.println(tempChar+" "+count);
        board[row][column] = '0';
        if (dfsWordSearch(board,row,column+1,maxRow,maxColumn,count+1,word) ||
        dfsWordSearch(board,row+1,column,maxRow,maxColumn,count+1,word) ||
        dfsWordSearch(board,row,column-1,maxRow,maxColumn,count+1,word) ||
        dfsWordSearch(board,row-1,column,maxRow,maxColumn,count+1,word)){
            return true;
        }
        board[row][column] = tempChar;
        return false;
    }
    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(board,"SEF"));
    }
}
