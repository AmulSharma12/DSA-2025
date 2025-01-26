package P2_Recursion;
import java.util.*;

public class P7_isPalindrome {
    public static void main(String[] args){
        boolean isPalindrome = isValidPalindrome(0,"absswba", 4);
        System.out.println("isPalindrome " + isPalindrome);
    }

    private static boolean isValidPalindrome(int ind, String input, int n){
        if(ind > n/2)   return true;
        if(input.charAt(ind) != input.charAt(n-ind-1))  return false;
        return isValidPalindrome(ind+1, input, n);
    }
}
