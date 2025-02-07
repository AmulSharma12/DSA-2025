package P0_LeetCodeDailyChallenge;
import java.util.*;
//https://leetcode.com/problems/find-the-number-of-distinct-colors-among-the-balls/description/
//3160. Find the Number of Distinct Colors Among the Balls
public class DC7_LC3160 {
    public static void main(String[] args){
        //call from here...
    }


    public static int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> colorMap = new HashMap<>();
        HashMap<Integer,Integer> ballMap = new HashMap<>();
        int [] res = new int [queries.length];

        for(int i=0;i<queries.length;i++){
            int newballMap = queries[i][0];
            int col = queries[i][1];
            if(ballMap.containsKey(newballMap)){
                int prev = ballMap.get(newballMap);
                colorMap.put(prev,colorMap.getOrDefault(prev,0)-1);
                if(colorMap.get(prev)==0){
                    colorMap.remove(prev);
                }
            }
            ballMap.put(newballMap,col);
            colorMap.put(col,colorMap.getOrDefault(col,0)+1);
            res[i]=colorMap.size();
        }
        return res;
    }
}
