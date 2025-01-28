package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/subsets-ii/

public class P15_LC90_Subsets2 {

    public static void main(String[] args){
        //call from here...
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        Set<List<Integer>> resultSet = new HashSet<>();
        generateUniqueSubsets(0, new ArrayList<>(), resultSet, nums, n);
        return new ArrayList<>(resultSet);
    }


    private static void generateUniqueSubsets(int index, List<Integer> list, Set<List<Integer>> resultSet, int[] nums, int n){
        //base case
        if(index == n){
            if(!resultSet.contains(list)){
                resultSet.add(new ArrayList<>(list));
            }
            return;
        }


        //logic - for pick & not pick
        generateUniqueSubsets(index+1, list, resultSet, nums , n);


        list.add(nums[index]);
        generateUniqueSubsets(index+1, list, resultSet, nums, n);
        list.remove(list.size() - 1);
    }
}
