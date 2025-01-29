package P2_Recursion;
import java.util.*;

//https://leetcode.com/problems/permutations/description/
public class P16_LC46_Permutations {
    public static void main(String[] args){
        //call from here...
    }

    private static void generatePermutations(int index, List<Integer> list, List<List<Integer>> permutations, int[] nums, boolean[] isMapped, int n){
        //base case - once my list size becomes equals to the array size that means I'm able to make all the arrangements
        if(list.size() == n){
            permutations.add(new ArrayList<>(list));
            return;
        }


        //only pick element that are not taken identified by isExistInList
        for(int i = 0; i < n; i++){
            if(!isMapped[i]){
                list.add(nums[i]);
                isMapped[i] = true;
                generatePermutations(i+1, list, permutations, nums, isMapped, n);
                isMapped[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        int n = nums.length;
        boolean[] isMapped = new boolean[n];
        generatePermutations(0, new ArrayList<>(), permutations, nums, isMapped, n);
        return permutations;
    }
}
