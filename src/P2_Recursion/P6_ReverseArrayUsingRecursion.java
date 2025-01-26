package P2_Recursion;
import java.util.*;

public class P6_ReverseArrayUsingRecursion {
    public static void main(String[] args){
        int[] nums = new int[]{4,3,2,1,6};
        reverseArray(nums, nums.length, 0);
        System.out.println(Arrays.toString(nums));
    }

    private static void reverseArray(int[] nums, int n, int i){
        if(i > n/2)   return;
        swap(nums,i,n-i-1);
        reverseArray(nums, n,i+1);
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
