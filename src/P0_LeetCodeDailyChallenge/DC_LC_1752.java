package P0_LeetCodeDailyChallenge;
import java.util.*;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/description
public class DC_LC_1752 {
    public static void main(String[] args){
        //call from here...
    }

    public boolean check(int[] nums) {
        int numberOfPositionsRotated = 0;
        int index = 0;
        int n = nums.length;


        while(index < n ){
            int nextElementIndex  = (index+1) % n;
            if(nums[index] > nums[nextElementIndex]) numberOfPositionsRotated++;
            index++;
        }

        return numberOfPositionsRotated < 2;
    }

}
