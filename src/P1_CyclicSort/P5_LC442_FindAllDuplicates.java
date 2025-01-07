package P1_CyclicSort;
import java.util.*;

public class P5_LC442_FindAllDuplicates {
    public static void main(String[] args){
        //call the method from here.....
    }

    public static List<Integer> findDuplicates(int[] nums) {
            List<Integer> result = new ArrayList<>();

            //placing the element in the correctIndex
            int index = 0;
            int n = nums.length;
            while(index < n){
                int correctIndex = nums[index] - 1;
                if(nums[index] != nums[correctIndex])
                    swap(nums, index, correctIndex);
                else
                    index++;
            }



            //scanning the element in the incorrect position
            for(int i = 0; i<n; i++){
                if(i != nums[i]-1){
                    result.add(nums[i]);
                }
            }

            return result;
        }

        private static void swap(int[] nums, int firstIndex, int secondIndex){
            int temp = nums[firstIndex];
            nums[firstIndex] = nums[secondIndex];
            nums[secondIndex] = temp;
        }
}
