package P2_Recursion;
import java.util.*;

public class P3_Print1ToN {
    public static void main(String[] args){
        print1ToN(1,6);
        print1ToNUsingBacktracking(7);
    }

    private static void print1ToN(int i, int n){
        if(i > n) return;
        System.out.println(i);
        print1ToN(i+1,n);
    }

    private static void print1ToNUsingBacktracking(int N){
        if(N == 0) return;
        print1ToNUsingBacktracking(N-1);
        System.out.println(N);
    }
}
