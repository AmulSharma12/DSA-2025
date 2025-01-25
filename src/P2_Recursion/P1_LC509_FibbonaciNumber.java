package P2_Recursion;
import java.util.*;
//https://leetcode.com/problems/fibonacci-number/

public class P1_LC509_FibbonaciNumber {
    public static void main(String[] args){
        //call method from here...
    }

    public static int fib(int n) {
        if(n == 0 || n == 1)    return n;
        return fib(n-1) + fib(n-2);
    }


}
