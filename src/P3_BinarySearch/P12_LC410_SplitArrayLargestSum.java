package P3_BinarySearch;
import java.util.*;
//https://leetcode.com/problems/split-array-largest-sum/

public class P12_LC410_SplitArrayLargestSum {
    public static void main(String[] args){
        //call from here.....
    }


    public static int splitArray(int[] nums, int k) {
        int n = nums.length, low = 0, high = 0;
        for (int i = 0; i < n; i++) {
            high += nums[i];
            low = Math.max(low, nums[i]);
        }
        int minimizeLargestSplit = high;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (isValid(nums, k, mid)) {
                high = mid-1;
                minimizeLargestSplit = Math.min(minimizeLargestSplit, mid);
            } else {
                low = mid+1;
            }
        }
        return minimizeLargestSplit;
    }

    private static boolean isValid(int[] nums, int k, int mid) {
        int split = 1, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (sum+nums[i] <= mid){
                sum += nums[i];
            } else {
                sum = nums[i];
                split++;
            }
        }
        return split <=k;
    }
}
