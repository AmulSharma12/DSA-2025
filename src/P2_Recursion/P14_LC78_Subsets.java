package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/subsets/description/

public class P14_LC78_Subsets {

    public static void main(String[] args){
        //call from here..
    }
    public static List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, new ArrayList<>(), subsets, nums, n);
        return subsets;
    }


    private static void generateSubsets(int index, List<Integer> list, List<List<Integer>> subsets, int[] nums , int n){
        //base case
        if(index == n){
            subsets.add(new ArrayList<>(list));
            return;
        }

        //logic for not pick & pick
        generateSubsets(index+1, list, subsets, nums, n);


        list.add(nums[index]);
        generateSubsets(index+1, list, subsets, nums, n);
        list.remove(list.size()-1);
    }
}
