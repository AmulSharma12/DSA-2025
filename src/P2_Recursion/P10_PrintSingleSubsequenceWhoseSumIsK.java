package P2_Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class P10_PrintSingleSubsequenceWhoseSumIsK {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,1,4};
        List<Integer> ds = new ArrayList<>();
        int k = 4;
        printAllSubsequenceWhoseSumIsK(0, nums, nums.length, ds, 0, k);

    }

    private static boolean printAllSubsequenceWhoseSumIsK(int index, int[] nums, int n,List<Integer> ds, int sum, int k){
        if(index == n){
            if(sum == k){
                System.out.println(ds.toString());
                return true;
            }
            return false;
        }


        ds.add(nums[index]);
        sum += nums[index];
        if(printAllSubsequenceWhoseSumIsK(index+1, nums, n, ds, sum, k))    return true;
        sum -= nums[index];
        ds.remove(ds.size()-1);
        if(printAllSubsequenceWhoseSumIsK(index+1,nums,n,ds,sum,k))     return true;

        return false;
    }
}
