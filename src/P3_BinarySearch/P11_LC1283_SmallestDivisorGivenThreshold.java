package P3_BinarySearch;
import java.util.*;
//https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/


public class P11_LC1283_SmallestDivisorGivenThreshold {
    public static void main(String[] args){
        //call from here...
    }


    //Naive approach - Getting TLE - Time limit exceeded
    public  static int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int maximum = -1;
        for(int element:nums){
            maximum = Math.max(maximum, element);
        }

        int divisor = 1;
        while(divisor <= maximum){
            int sum = 0;
            for(int element : nums){
                sum += (int)Math.ceil((double)element/divisor);
            }

            if(sum <= threshold) break;
            divisor ++;
        }


        return divisor;
    }

}
