package P2_Recursion;
import java.util.*;

public class P11_CountSubsequenceWhoseSumIsK {
    public static void main(String[] args){
        int[] nums = new int[]{1,2,1,4};

        int k = 4;
        int countOfSubsequenceWhoseSumIsK = CountSubsequenceWhoseSumIsK(0, nums, nums.length,  0, k);
        System.out.println(countOfSubsequenceWhoseSumIsK);
    }

    private static int CountSubsequenceWhoseSumIsK(int index, int[] nums, int n, int sum, int k){
        if(index == n){
            if(sum == k)    return 1;
            return 0;
        }



        sum += nums[index];
        int pickCount = CountSubsequenceWhoseSumIsK(index+1, nums, n, sum, k);
        sum -= nums[index];

        int nonPickCount = CountSubsequenceWhoseSumIsK(index+1,nums,n,sum,k);

        return pickCount + nonPickCount;
    }
}
