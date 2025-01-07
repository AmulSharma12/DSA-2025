package P1_CyclicSort;
import java.util.*;

public class P6_LC41_FirstMissingPositive {
    public static void main(String[] args){
        //call the function from here....
    }


    public static  int firstMissingPositive(int[] nums) {
        int n = nums.length;

        //placing the element at their correct Index avoid negative number & for those whose element index is       not present in correctIndex
        int index = 0;
        while(index < n){
            int correctIndex = nums[index] -1;

            //the correctIndex should be in the range then only we can place otherwise no chance
            if((correctIndex >= 0 && correctIndex < n) && nums[index] != nums[correctIndex]){
                swap(nums, index , correctIndex);
            }else{
                index++;
            }
        }

        System.out.println(Arrays.toString(nums));
        int firstMissingPositive = n+1;
        //the very first element that is in incorrect index
        for(int correctIndex = 0; correctIndex < n; correctIndex++){
            // if(nums[correctIndex] <= 0) continue;
            if(correctIndex != nums[correctIndex] -1){
                firstMissingPositive = correctIndex + 1;
                break;
            }
        }


        return firstMissingPositive;

    }

    private static void swap(int[] nums, int currIndex, int swapIndex){
        int temp = nums[currIndex];
        nums[currIndex] = nums[swapIndex];
        nums[swapIndex] = temp;
    }
}
