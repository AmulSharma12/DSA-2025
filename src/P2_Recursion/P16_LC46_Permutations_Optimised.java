package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/permutations/description/

public class P16_LC46_Permutations_Optimised {
    public static void main(String[] args){
        //code from here...
    }

    private static void generatePermutations(int index, List<List<Integer>> permutations, int[] nums,  int n){
        //base case
        if(index == n-1){
            List<Integer> list = new ArrayList<>();
            for(int element: nums){
                list.add(element);
            }

            permutations.add(new ArrayList<>(list));
        }

        //logic  swapping element for index to i = index to n-1
        for(int i = index; i<n; i++){
            swap(nums, index, i);
            generatePermutations(index+1, permutations, nums, n);
            swap(nums, index, i);
        }

    }

    private  static void swap(int[] nums, int start, int end){
        int tempElement = nums[start];
        nums[start] = nums[end];
        nums[end] = tempElement;
    }

    public static List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(0, permutations, nums, n);
        return permutations;
    }
}
