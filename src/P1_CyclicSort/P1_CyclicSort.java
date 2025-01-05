package P1_CyclicSort;
import java.util.*;
public class P1_CyclicSort {
    public static void main(String[] args){

        int[] nums = {2,3,1,4,5};
        System.out.println(Arrays.toString(nums));
        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

    //sorting pattern - to sort the array for the element of range 1-N  in single pass
    private static void sort(int[] nums){
        int n = nums.length;
        int index = 0;      //initalising index to 0

        while(index < n){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }else{
                index++;
            }

//            System.out.println(Arrays.toString(nums));
        }


    }


    //for swapping array elements
    private static void swap(int[] nums , int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}
