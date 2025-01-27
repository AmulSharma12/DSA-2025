package P2_Recursion;
import java.util.*;

public class P12_LC39_CombinationSum {
    public static void main(String[] args){
        //call from here....
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> combinations = new ArrayList<>();
        int n = candidates.length;
        generateCombinations(0, new ArrayList<>(), combinations, candidates, target, n);
        return combinations;
    }

    private void generateCombinations(int index, List<Integer> list, List<List<Integer>> combinations, int[] nums , int target, int  n){
        if(index == n){
            if(target == 0){
                combinations.add(new ArrayList<>(list));
            }
            return;
        }

        generateCombinations(index+1, list, combinations, nums, target, n);

        if(nums[index] <= target){
            list.add(nums[index]);
            generateCombinations(index, list, combinations, nums, target - nums[index], n);
            list.remove(list.size()-1);

        }
    }
}
