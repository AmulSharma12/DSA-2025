package P1_CyclicSort;
import java.util.*;

public class P4_LC287_DuplicateNumber {
    public static void main(String[] args){
        //call the function from here....
    }


    public static int findDuplicate(int[] nums) {
        int n = nums.length;
        int index = 0;

        //placing element at their correct position
        while(index < n){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else index++;
        }

        System.out.println(Arrays.toString(nums));
        int duplicate = -1;
        //scanning to check which elemnet is not in the correct position
        for(int i = 0; i<n; i++){
            if(nums[i] != i+1){
                duplicate = nums[i];
                break;
            }
        }

        return duplicate;
    }


    private static void swap(int[] nums, int startIndex, int endIndex){
        int temp = nums[startIndex];
        nums[startIndex] = nums[endIndex];
        nums[endIndex] = temp;
    }
}
