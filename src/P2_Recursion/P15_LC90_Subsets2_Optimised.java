package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/subsets-ii/

public class P15_LC90_Subsets2_Optimised {
    public static void main(String[] args){
        //call from here...
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        generateUniqueSubsets(0, new ArrayList<>(), result, nums, n);
        return result;
    }


    private void generateUniqueSubsets(int index, List<Integer> list, List<List<Integer>> result, int[] nums, int n){

        result.add(new ArrayList<>(list));

        for(int i = index; i < n; i++){
            if(i > index && nums[i] == nums[i-1]) continue;

            list.add(nums[i]);
            generateUniqueSubsets(i+1, list, result , nums, n);
            list.remove(list.size() - 1);
        }
    }
}
