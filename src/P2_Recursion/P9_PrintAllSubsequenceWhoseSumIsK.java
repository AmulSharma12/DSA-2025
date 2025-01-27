package P2_Recursion;
import java.util.*;

public class P9_PrintAllSubsequenceWhoseSumIsK {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,1,4};
        List<Integer> ds = new ArrayList<>();
        int k = 1;
        printAllSubsequenceWhoseSumIsK(0, nums, nums.length, ds, 0, k);

    }

    private static void printAllSubsequenceWhoseSumIsK(int index, int[] nums, int n,List<Integer> ds, int sum, int k){
        if(index == n){
            if(sum == k){
                System.out.println(ds.toString());
            }
            return;
        }


        ds.add(nums[index]);
        sum += nums[index];
        printAllSubsequenceWhoseSumIsK(index+1, nums, n, ds, sum, k);
        sum -= nums[index];
        ds.remove(ds.size()-1);
        printAllSubsequenceWhoseSumIsK(index+1,nums,n,ds,sum,k);
    }
}
