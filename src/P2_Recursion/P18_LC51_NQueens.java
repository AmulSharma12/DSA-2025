package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/n-queens/description/
public class P18_LC51_NQueens {
    public static void main(String[] args){
        //code from here...
    }


    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> nQueenResult = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] ch: board){
            Arrays.fill(ch,'.');
        }
        placeNQueens(0, board, nQueenResult, n);
        return nQueenResult;
    }

    private static void placeNQueens(int col, char[][] board, List<List<String>> nQueenResult, int n){
        //base case - if I am able to place N Queens then will reach the col to N
        if(col == n){
            nQueenResult.add(toBoardList(board));
            return;
        }
        for(int row = 0; row < n; row++){
            if(isSafeToPlaceQueen(board, row, col, n)){
                board[row][col] = 'Q';
                placeNQueens(col + 1, board, nQueenResult, n);
                board[row][col] = '.';
            }
        }
    }

    private static boolean isSafeToPlaceQueen(char[][] board, int row, int col, int n){
        int dupRow ;
        int dupCol ;

        //checking queen over that specific row
        for(dupRow = row, dupCol = col; dupCol >= 0 ; dupCol--){
            if(board[dupRow][dupCol] == 'Q')    return false;
        }

        //checking for queen in left upper diagonal
        for(dupRow = row, dupCol = col; dupCol >= 0 && dupRow >= 0; dupCol--, dupRow--){
            if(board[dupRow][dupCol] == 'Q')    return false;
        }

        //checking for queen in left lower diagonal
        for(dupRow = row, dupCol = col; dupCol >= 0 && dupRow < n; dupRow++, dupCol--){
            if(board[dupRow][dupCol] == 'Q')    return false;
        }

        return true;
    }


    private static List<String> toBoardList(char[][] board){
        List<String> boardList = new ArrayList<>();
        for(char[] ch: board){
            boardList.add(new String(ch));
        }

        return boardList;
    }

}
