package P0_LeetCodeDailyChallenge;
import java.util.*;
//LC2185 - https://leetcode.com/problems/counting-words-with-a-given-prefix/description/


public class LC2185_9JAN25_CountingWordsWithGivenPrefix {
    public static void main(String[] args){
        //call the function from here....
    }

    public static int prefixCount(String[] words, String pref) {
        int countOfWordsContainingPrefix = 0;
        int n = words.length;
        int prefixLength = pref.length();
        for(int arrIndex = 0; arrIndex < n; arrIndex++){
            String word = words[arrIndex];
            int wordLength = word.length();

            if(wordLength < prefixLength)   continue;
            int index = 0;
            for(; index < prefixLength; index++){
                if(word.charAt(index) != pref.charAt(index))    break;
            }

            if(index == prefixLength) countOfWordsContainingPrefix++;
        }

        return countOfWordsContainingPrefix;
    }
}
