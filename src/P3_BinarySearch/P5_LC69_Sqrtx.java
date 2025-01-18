package P3_BinarySearch;
import java.util.*;

//https://leetcode.com/problems/sqrtx/description/
public class P5_LC69_Sqrtx {
    public static void main(String[] args){
        //call from here...
    }


    public static int mySqrt(int x) {
        int squareRoot = 0;
        int startElement = 1;
        int endElement = x;

        //now my sqrt will lies in between 0-x
        while(startElement <= endElement){
            int midElement = startElement + (endElement-startElement)/2;

            if((long)midElement * midElement <= x){
                squareRoot = midElement;
                startElement = midElement + 1;

            }else{
                endElement = midElement - 1;
            }

        }

        return squareRoot;
    }
}
