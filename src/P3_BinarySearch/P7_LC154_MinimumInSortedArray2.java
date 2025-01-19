package P3_BinarySearch;
import java.util.*;
//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/description/
public class P7_LC154_MinimumInSortedArray2 {
    public static void main(String[] args){
        //call from here...
    }

    public static int findMin1(int[] nums) {
        int n = nums.length;
        int minimumElement = nums[0];

        for(int index = 0; index < n; index++){
            if(nums[index] < minimumElement) minimumElement = nums[index];
        }


        return minimumElement;
    }


    public static  int findMin2(int[] nums) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        //because when startIndex and endIndex points to same element that is minimum
        while(startIndex < endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] < nums[endIndex])  endIndex = midIndex;
            else if(nums[midIndex] > nums[endIndex])  startIndex = midIndex + 1;
            else endIndex--;
        }

        return nums[startIndex];
    }
}
