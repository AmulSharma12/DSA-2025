package P2_Recursion;
import java.util.*;
//https://leetcode.com/problems/sudoku-solver/
public class P19_LC37_Sudoku_Solver {
    public static void main(String[] args){
        //call from here...
    }

    private static boolean solve(char[][] board){
        //traversing each row for every col
        for(int row = 0; row < board.length ; row++){
            for(int col = 0; col < board[0].length; col++){
                //first check would be the cell needs to be empty i.e. character placed should be '.'
                if(board[row][col] == '.'){
                    //now try out all the possibilities i.e. 1,2,3.... till 9
                    for(char digit = '1' ; digit <= '9' ; digit++){
                        if(isValidToBePlaced(board, row, col, digit)){
                            board[row][col] = digit;

                            //once you get the answer no need to backtrack just get with the board and answer
                            if(solve(board))  return true;
                            else board[row][col] = '.';   //you need to backtrack as above recursion didn't worked
                        }
                    }
                    //while trying out all the possibilites you are unable to place any of the digit so this can't be your answer
                    return false;
                }
            }
        }
        //you will only able to reach there once all the cells are filled means all the cell filled in valid conditions
        return true;
    }

    private static boolean isValidToBePlaced(char[][] board, int row, int col, char digit){
        //checking for each 3 conditions
        for(int index = 0; index < 9 ; index++){
            //checking in column
            if(board[row][index] == digit) return false;
            //checking in row
            if(board[index][col] == digit) return false;
            //checking in grid
            if(board[3*(row/3) + index/3][3*(col/3) + index%3] == digit)  return false;
        }
        return true;
    }

    public static void solveSudoku(char[][] board) {
        solve(board);
    }
}
