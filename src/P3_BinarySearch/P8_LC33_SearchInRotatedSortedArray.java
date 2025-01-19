package P3_BinarySearch;
import java.util.*;
//https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class P8_LC33_SearchInRotatedSortedArray {
    public static void main(String[] args){
        //call from here...
    }

    public static int search1(int[] nums, int target) {
        int n = nums.length;
        int targetIndex = -1;
        for(int index = 0; index<n; index++){
            if(nums[index] == target){
                targetIndex = index;
                break;
            }
        }

        return targetIndex;
    }


    public static int search2(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;
        int position = -1;

        while(startIndex <= endIndex) {
            int midIndex = (startIndex + endIndex)/2;
            if(nums[midIndex] == target){
                position = midIndex;
                break;
            }


            if(nums[startIndex] <= nums[midIndex]){
                if(nums[startIndex] <= target && target <= nums[midIndex])  endIndex = midIndex -1;
                else startIndex = midIndex + 1;
            }else{
                if(nums[midIndex] <= target && target <= nums[endIndex])    startIndex = midIndex + 1;
                else endIndex = midIndex - 1;
            }
        }

        return position;
    }
}
