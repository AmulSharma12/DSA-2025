package P0_LeetCodeDailyChallenge;
import java.util.*;
//https://leetcode.com/problems/tuple-with-same-product/
public class DC6_LC1726 {
    public static void main(String[] args){
        //call from here...
    }

    //how manny pairs you can make
    private static int nc2(int n){
        return n * (n-1)/2;
    }

    public static int tupleSameProduct(int[] nums) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        //mapping the frequencey of the pair (a*b)
        for(int i = 0; i<n-1; i++){
            for(int j = i + 1; j < n; j++){
                int productPair = nums[i] * nums[j];
                map.put(productPair, map.getOrDefault(productPair, 0) + 1);
            }
        }

        int count = 0;
        //traversing the map and for every productPair (a*b) that is greater than 1 frequency
        for(int mapValue: map.values()){
            if(mapValue > 1){

                count +=  8 * nc2(mapValue);
            }
        }

        return count;
    }

}
