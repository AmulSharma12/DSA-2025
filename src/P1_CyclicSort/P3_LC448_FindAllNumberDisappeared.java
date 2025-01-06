package P1_CyclicSort;
import java.util.*;

public class P3_LC448_FindAllNumberDisappeared {
    public static void main(String[] args){
        //call from here...
    }


    //Approach 1 - using naive solution
    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        boolean[] isElementExist = new boolean[n];
        for(int i = 0; i<n; i++){
            int correctIndex = nums[i] - 1;
            isElementExist[correctIndex] = true;
        }

        for(int i = 0; i<n; i++){
            if(!isElementExist[i]){
                int element = i + 1;
                result.add(element);
            }
        }

        return result;
    }



    //Approach 2 - using optimised approach - cyclic sort
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int index = 0;

        while(index < n){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else index++;
        }


        //scanning the array
        for(int i = 0; i<n; i++){
            if(nums[i] != i+1){
                result.add(i+1);
            }
        }

        return result;
    }

    //swap method for swapping two position element in the array
    private static void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
