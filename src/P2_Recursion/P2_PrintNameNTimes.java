package P2_Recursion;
import java.util.*;


public class P2_PrintNameNTimes {
    public static void main(String[] args){
        printNameNTimes(1,5);
    }

    private static void printNameNTimes(int i, int n){
        if(i > n)   return;
        System.out.println("Amul Sharma");
        printNameNTimes(i+1,n);
    }

}
