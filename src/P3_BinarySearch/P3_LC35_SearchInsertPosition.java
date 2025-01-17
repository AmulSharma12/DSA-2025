package P3_BinarySearch;
import java.util.*;

public class P3_LC35_SearchInsertPosition {
    public static void main(String[] args){
        //call from here...
    }


    //Naive approach
    public static int searchInsertNaive(int[] nums, int target) {
        int n = nums.length;

        //traverse each element linearly - as array is sorted
        //you will either find the target element or if it doesn't exist you will encounter a element
        //that is larger than your target

        //if all the element in array having element < target then it is the last position which will
        //be my insertPosition
        int insertPosition = n;

        for(int index = 0; index < n; index++){
            if(nums[index] >= target){
                insertPosition = index;
                break;
            }
        }


        return insertPosition;

    }


    //Optimised Approach
    public static int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;

        //In binary search always know if target would be found - thats great
        //if not found then both index pointer crosses the index
        // endIndex (pointing to element < target) & startIndex (pointing to element > target)
        // e.g.  target - 4     [3,5]   [endIndexPointer, startIndexPointer]  means 4 should be coming in place of 5
        //So, startIndex will have my answer that is the element expected position of target
        int searchInsertPosition = -1;
        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;
            if(nums[midIndex] == target){
                searchInsertPosition = midIndex;
                break;
            }else if(target > nums[midIndex]){
                startIndex = midIndex + 1;
            }else{
                endIndex = midIndex - 1;
            }
        }
        return searchInsertPosition != -1 ? searchInsertPosition : startIndex;
    }
}
