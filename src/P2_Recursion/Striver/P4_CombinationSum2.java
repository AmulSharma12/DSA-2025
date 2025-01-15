package P2_Recursion.Striver;
import java.util.*;

public class P4_CombinationSum2 {
    public static void main(String[] args){
        //call from here...
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        int n = candidates.length;
        generateCombinations(0, new ArrayList<>(), result,candidates, n, target);
        return result;
    }

    private static void generateCombinations(int index, List<Integer> list, List<List<Integer>> combinations,int[] nums, int n, int target){
        //base case
        if(target == 0){
            combinations.add(new ArrayList<>(list));
            return;
        }

        //logic
        for(int i = index; i<n; i++){
            if(i > index && nums[i-1] == nums[i])    continue;
            if(nums[i] > target) break;
            list.add(nums[i]);
            generateCombinations(i+1,list, combinations, nums, n, target-nums[i]);
            list.remove(list.size()-1);


            // generateCombinations(i+1,list, combinations, nums, n, target);
        }


    }
}
