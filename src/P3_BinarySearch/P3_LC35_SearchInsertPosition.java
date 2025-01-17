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
}
