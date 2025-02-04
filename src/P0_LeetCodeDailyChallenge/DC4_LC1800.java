package P0_LeetCodeDailyChallenge;
import java.util.*;
//https://leetcode.com/problems/maximum-ascending-subarray-sum/description/
public class DC4_LC1800 {
    public static void main(String[] args){
        //call from here...
    }

    public static int maxAscendingSum(int[] nums) {
        int maxAscendingSum = nums[0];      //the first element keeping it as max
        int currentSum = nums[0];       //will start from index 1 so keeping the first element as the part of current sum.
        int n = nums.length;

        //looping from 1 to n-1    => everytime check with the previous elmenet
        for(int index = 1; index < n; index++){
            //if the element following the ascending array need to increment currentSum
            if(nums[index] > nums[index-1])    currentSum += nums[index];
            else {
                //we lost the ascending array so need to restart again with that currentSum initalised with the element itself
                currentSum = nums[index];
            }
            maxAscendingSum = Math.max(maxAscendingSum, currentSum);
        }


        //returning answer
        return maxAscendingSum;
    }
}
