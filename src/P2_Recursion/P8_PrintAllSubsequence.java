package P2_Recursion;
import java.util.*;

public class P8_PrintAllSubsequence {
    public static void main(String[] args){
        int[] arr = new int[]{2,4,1};
        List<Integer> ds = new ArrayList<>();
        printAllSubsequence(0,ds,arr,arr.length);
    }


    private static void printAllSubsequence(int index, List<Integer> ds, int[] nums, int n){
        if(index == n){
            System.out.println(ds.toString());
            return;
        }


        //not pick case
        printAllSubsequence(index+1, ds, nums, n);
        //pick case
        ds.add(nums[index]);
        printAllSubsequence(index+1, ds, nums, n);
        ds.remove(ds.size()-1);
    }
}
