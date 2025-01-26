package P2_Recursion;
import java.util.*;

public class P4_PrintNto1 {
    public static void main(String[] args){
        printNto1(5);
        printNto1UsingBacktracking(1,6);
    }


    private static void printNto1(int N){
        if(N == 0)  return;
        System.out.println(N);
        printNto1(N-1);
    }

    private static void printNto1UsingBacktracking(int i,int N){
        if(i > N)   return;
        printNto1UsingBacktracking(i+1, N);
        System.out.println(i);
    }
}
