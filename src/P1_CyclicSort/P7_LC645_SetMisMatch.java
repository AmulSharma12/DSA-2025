package P1_CyclicSort;
import java.util.*;

//Problem link - https://leetcode.com/problems/set-mismatch/description/

public class P7_LC645_SetMisMatch {
    public static void main(String[] args){
        //call from here.....
    }


    //Approach 1- using naive solution
    public static  int[] findErrorNums2(int[] nums) {
        int n = nums.length;
        int duplicateElement = -1;
        int missingElement = -1;
        int[] frequency = new int[n];

        //scanning the input array for counting the frequency
        //element frequence should be at index = element - 1
        for(int i = 0; i<n; i++){
            frequency[nums[i]-1]++;
        }


        //now scanning the frequency array
        for(int i = 0; i<n; i++){
            if(frequency[i] == 0){
                missingElement = i + 1;
            }

            if(frequency[i] == 2){
                duplicateElement = i + 1;
            }

            if(missingElement != -1 && duplicateElement != -1)  break;
        }
        return new int[] {duplicateElement, missingElement};
    }

    //Approach 2 - using optimised way without extra space
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int duplicateElement = -1;
        int missingElement = -1;

        //place the element at their correct indexes
        int index = 0;
        while(index < n){
            int correctIndex = nums[index] - 1;
            if(nums[index] != nums[correctIndex]){
                swap(nums, index, correctIndex);
            }
            else{
                index++;
            }
        }



        //scanning the element that are in the incorrect position
        for(int i = 0; i<n; i++){
            if(i != nums[i]  - 1){
                duplicateElement = nums[i];
                missingElement = i + 1;
            }
        }


        return new int[] {duplicateElement, missingElement};
    }

    private static void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }


}
