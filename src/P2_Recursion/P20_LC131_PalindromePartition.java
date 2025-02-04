package P2_Recursion;
import java.util.*;
//https://leetcode.com/problems/palindrome-partitioning/
public class P20_LC131_PalindromePartition {
    public static void main(String[] args){
        //call from here...
    }

    private static void allPossiblePalindromePartition(int index, String inputString, List<String> palindromePartition, List<List<String>> palindromePartitionResult,int n){
        //base case
        if(index == n){
            palindromePartitionResult.add(new ArrayList<>(palindromePartition));
            return;
        }
        //logic - try to partition from every way
        for(int i = index; i < n; i++){

            if(isValidPalindrome(inputString, index, i)){
                palindromePartition.add(inputString.substring(index, i+1));
                allPossiblePalindromePartition(i + 1, inputString, palindromePartition, palindromePartitionResult, n);
                palindromePartition.remove(palindromePartition.size() - 1);
            }
        }
    }

    private static  boolean isValidPalindrome(String inputString, int startIndex, int endIndex){
        while(startIndex <= endIndex){
            if(inputString.charAt(startIndex++) != inputString.charAt(endIndex--))  return false;
        }
        return true;
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> palindromePartitionResult = new ArrayList<>();
        List<String> palindromePartition = new ArrayList<>();
        int n = s.length();
        allPossiblePalindromePartition(0, s, palindromePartition, palindromePartitionResult, n);
        return palindromePartitionResult;
    }
}
