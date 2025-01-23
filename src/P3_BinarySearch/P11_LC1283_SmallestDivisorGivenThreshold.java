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

    //Optimised approach
    public static int smallestDivisor2(int[] nums, int threshold) {
        int n = nums.length;
        int maximum = -1;
        //getting the maximum element from the array
        for(int element:nums){
            maximum = Math.max(element, maximum);
        }
        System.out.println(maximum);
        int lowDivisor = 1;
        int highDivisor = maximum;
        System.out.println(maximum);
        while(lowDivisor < highDivisor){
            int sum = 0;
            int midDivisor = lowDivisor + (highDivisor - lowDivisor)/2;
            for(int element: nums){
                sum += (int)Math.ceil((double)element/midDivisor);
            }
            System.out.println(midDivisor + " " + sum);

            if(sum <= threshold){
                highDivisor = midDivisor;

            }else{
                lowDivisor = midDivisor + 1;
            }
        }

        return lowDivisor;
    }

}
