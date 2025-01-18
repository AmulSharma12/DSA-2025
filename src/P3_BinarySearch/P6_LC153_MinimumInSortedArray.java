package P3_BinarySearch;
import java.util.*;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/
public class P6_LC153_MinimumInSortedArray {
    public static void main(String[] args){
        //call from here....
    }

    //using linear search approach
    public static int findMin1(int[] nums) {
        int arrayLength = nums.length;
        int minimumElement = nums[0];     //very first element can be my minimum

        for(int index = 1; index < arrayLength; index++){
            if(nums[index] < minimumElement){
                minimumElement = nums[index];   //storing the minimum if any element encounters lesser than minimumElement
            }
        }

        return minimumElement;
    }

    //Optimised approach using binary search
    public static  int findMin(int[] nums) {
        int n = nums.length;
        int minimumElement = -1 ;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex < endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] < nums[endIndex]) endIndex = midIndex;
            else startIndex = midIndex + 1;

        }
        return nums[startIndex];
    }
}
