package P0_LeetCodeDailyChallenge;
import java.util.*;

//https://leetcode.com/problems/special-array-i/description
public class DC_01_02_2025_LC3151 {
    public static void main(String[] args){
        //call from here...
    }

    public static boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if(n == 1)   return true;
        boolean arraySpecial = true;
        int index = 0;
        while(index < n - 1){
            if(!isDifferentParity(nums[index], nums[index+1]))   break;
            index++;
        }


        return index == n - 1 ? arraySpecial : !arraySpecial;
    }

    private static boolean isDifferentParity(int number , int adjacentElement){
        boolean isEvenNumber = number % 2 == 0;
        boolean isEvenAdjacent = adjacentElement % 2 == 0;
        return (isEvenNumber && !isEvenAdjacent) || (!isEvenNumber && isEvenAdjacent);
    }

}
