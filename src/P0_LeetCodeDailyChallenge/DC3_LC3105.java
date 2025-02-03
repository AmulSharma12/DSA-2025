package P0_LeetCodeDailyChallenge;
import java.util.*;
//https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/
//Longest Strictly Increasing or Strictly Decreasing Subarray
public class DC3_LC3105 {
    public static void main(String[] args){
        //call from here....
    }

    public static int longestMonotonicSubarray(int[] nums) {
        int longestStrictlyIncreasing = 1;
        int longestStrictlyDecreasing = 1;
        int countIncreasingSubarray = 1;
        int countDecreasingSubarray = 1;
        int n = nums.length;

        for(int index = 1; index < n; index++){
            //strictly increasing
            if(nums[index] > nums[index-1]){
                countIncreasingSubarray++;
                longestStrictlyIncreasing = Math.max(longestStrictlyIncreasing, countIncreasingSubarray);
            }else{
                countIncreasingSubarray = 1;
            }

            //strictly decreasing
            if(nums[index] < nums[index-1]){
                countDecreasingSubarray++;
                longestStrictlyDecreasing = Math.max(longestStrictlyDecreasing, countDecreasingSubarray);
            }else{
                countDecreasingSubarray = 1;
            }
        }

        return Math.max(longestStrictlyIncreasing, longestStrictlyDecreasing);
    }
}
