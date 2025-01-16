package P3_BinarySearch;
import java.util.*;

//LC 34(Medium) - Find First and Last Position of Element in Sorted Array

public class P2_LC34_FirstAndLastOccurenceInSortedArray {
    public static void main(String[] args){
        //call from here....
    }

    public static  int[] searchRange(int[] nums, int target) {
        int firstOccurence = -1;
        int lastOccurence = -1;
        int startIndex = 0;
        int n = nums.length;
        int endIndex = n-1;

        while(startIndex <= endIndex){
            int midIndex = (startIndex + endIndex)/2;
            if(nums[midIndex] == target){
                firstOccurence = midIndex;
                endIndex = midIndex - 1;
            }else if(target > nums[midIndex]){
                startIndex = midIndex + 1;
            }else{
                endIndex = midIndex - 1;
            }
        }

        startIndex = 0;
        endIndex = n-1;

        while(startIndex <= endIndex){
            int midIndex = (startIndex + endIndex)/2;
            if(nums[midIndex] == target){
                lastOccurence = midIndex;
                startIndex = midIndex + 1;
            }else if(target > nums[midIndex]){
                startIndex = midIndex + 1;
            }else{
                endIndex = midIndex - 1;
            }
        }


        return new int[]{firstOccurence, lastOccurence};
    }
}
