package P0_LeetCodeDailyChallenge;
import java.util.*;
//https://leetcode.com/problems/largest-odd-number-in-string/description/
public class RP1_01_02_2025_LC1903 {
    public static void main(String[] args){
        //code from here...
    }

    public static String largestOddNumber(String num) {
        int n = num.length();
        int currIndex = n - 1;

        while(currIndex >= 0){
            int number = Character.getNumericValue(num.charAt(currIndex));
            if(number % 2 != 0) break;
            currIndex--;
        }

        return num.substring(0, currIndex+1);

    }
}
