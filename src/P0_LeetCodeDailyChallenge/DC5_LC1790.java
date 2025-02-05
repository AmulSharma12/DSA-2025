package P0_LeetCodeDailyChallenge;
import java.util.*;
//
public class DC5_LC1790 {
    public static void main(String[] args){
        //call from here...
    }

    public static boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))   return true;    //if both equal no need to check

        int n = s1.length();
        int index1 = -1, index2 = -1;
        int numberOfMisMatches = 0;

        for (int index = 0; index < n; index++) {
            if (s1.charAt(index) != s2.charAt(index)) {
                numberOfMisMatches++;

                if (index1 == -1) {
                    index1 = index;
                } else if (index2 == -1) {
                    index2 = index;
                } else {
                    //only at most one swap allow so there is no point if found element more than 1 mismatched element
                    return false;
                }
            }
        }

        return numberOfMisMatches == 2 &&
                s1.charAt(index1) == s2.charAt(index2) &&
                s1.charAt(index2) == s2.charAt(index1);
    }
}
