package P3_BinarySearch;
import java.util.*;

//https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class P10_LC209_MinimumSizeSubarraySum {
    public static void main(String[] args){
        //call from here....
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int start = 1;
        int end = len;
        int minLen = len + 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int foundWindowSize = windowExists(nums, target, mid);
            if (foundWindowSize > 0) {
                end = foundWindowSize - 1;
                minLen = foundWindowSize;
            } else {
                start = mid + 1;
            }
        }

        return minLen % (len + 1);
    }

    private static int windowExists(int[] nums, int target, int maxWindowSize) {
        int foundWindowSize = 0;
        for (int i = 0; i < nums.length; i++) {
            target -= nums[i];
            foundWindowSize++;

            if (i >= maxWindowSize) {
                foundWindowSize--;
                target += nums[i - maxWindowSize];
            }

            if (target <= 0) {
                return foundWindowSize;
            }
        }

        return -1;
    }
}
