package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/combination-sum-ii/description/ (LC-40 Combination sum 2)
public class P13_LC40_CombinationSum2 {
    public static void main(String[] args){
        //call from here...
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int n = candidates.length;
        List<List<Integer>> resultSet = new ArrayList<>();
        generateCombinations(0, new ArrayList<>(), resultSet, candidates, target, candidates.length);
        return resultSet;
    }


    private static void generateCombinations(int index, List<Integer> list, List<List<Integer>> resultSet, int[] nums, int target , int n){
        //base case

        if(target == 0){
            resultSet.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i<n; i++){
            if(nums[i] > target) break;
            if(i > index && nums[i] == nums[i-1]) continue;

            list.add(nums[i]);
            generateCombinations(i+1, list, resultSet, nums, target- nums[i], n);
            list.remove(list.size()-1);

        }

    }
}
