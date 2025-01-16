package P3_BinarySearch;
import java.util.*;
//LC - 704  https://leetcode.com/problems/binary-search/description/

public interface P1_BinarySearch {
    public static void main(String[] args){
        //call from here...
    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int startIndex = 0;
        int endIndex = n-1;
        int result = -1;
        while(startIndex <= endIndex){
            int midIndex = startIndex + (endIndex-startIndex)/2;
            if(nums[midIndex] == target){
                result = midIndex;
                break;
            }else if(target > nums[midIndex]){
                startIndex = midIndex + 1;
            }else{
                endIndex = midIndex - 1;
            }
        }

        return result;
    }
}
