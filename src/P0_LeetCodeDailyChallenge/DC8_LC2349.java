package P0_LeetCodeDailyChallenge;
import java.util.*;

//https://leetcode.com/problems/design-a-number-container-system/
public class DC8_LC2349 {
    HashMap<Integer,Integer> indexMapNumber;
    HashMap<Integer,TreeSet<Integer>> numberMapIndex;
    public DC8_LC2349()
    {
        indexMapNumber = new HashMap<>();
        numberMapIndex = new HashMap<>();
    }

    public void change(int index, int number)
    {
        if(indexMapNumber.containsKey(index))
            numberMapIndex.get(indexMapNumber.get(index)).remove(index);
        if(!numberMapIndex.containsKey(number))
            numberMapIndex.put(number,new TreeSet<Integer>());
        indexMapNumber.put(index,number);
        numberMapIndex.get(number).add(index);
    }

    public int find(int number)
    {
        if(!numberMapIndex.containsKey(number) || numberMapIndex.get(number).size() == 0)
            return -1;
        return numberMapIndex.get(number).first();
    }
}
