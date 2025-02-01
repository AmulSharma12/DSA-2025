package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/n-queens/description/

public class P18_LC51_NQueens_Optimsied {
    public static void main(String[] args){
        //code from here...
    }

    private static void placeNQueens(int col, char[][] board, boolean[] leftRow, boolean[] leftUpperDiagonal, boolean[] leftLowerDiagonal,
                              List<List<String>> nQueenResult, int n){
        //base case - if I am able to place N Queens then will reach the col to N
        if(col == n){
            nQueenResult.add(toBoardList(board));
            return;
        }
        for(int row = 0; row < n; row++){
            if(isSafeToPlaceQueen(leftRow,leftUpperDiagonal, leftLowerDiagonal, row, col, n)){
                leftRow[row] = true;
                leftLowerDiagonal[row+col] = true;
                leftUpperDiagonal[n-1 + col - row] = true;
                board[row][col] = 'Q';
                placeNQueens(col + 1, board,leftRow, leftUpperDiagonal, leftLowerDiagonal,nQueenResult, n);
                board[row][col] = '.';
                leftRow[row] = false;
                leftLowerDiagonal[row+col] = false;
                leftUpperDiagonal[n-1 + col - row] = false;
            }
        }
    }

    private static boolean isSafeToPlaceQueen(boolean[] leftRow, boolean[] leftUpperDiagonal, boolean[] leftLowerDiagonal, int row, int col, int n){
        return !leftRow[row] && !leftLowerDiagonal[row+col] && !leftUpperDiagonal[n-1+col-row];
    }


    private static List<String> toBoardList(char[][] board){
        List<String> boardList = new ArrayList<>();
        for(char[] ch: board){
            boardList.add(new String(ch));
        }

        return boardList;
    }


    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> nQueenResult = new ArrayList<>();
        char[][] board = new char[n][n];
        boolean[] leftRow = new boolean[n];
        boolean[] leftUpperDiagonal = new boolean[2*n-1];
        boolean[] leftLowerDiagonal = new boolean[2*n - 1];
        for(char[] ch: board){
            Arrays.fill(ch,'.');
        }
        placeNQueens(0, board, leftRow, leftUpperDiagonal, leftLowerDiagonal, nQueenResult, n);
        return nQueenResult;
    }
}
