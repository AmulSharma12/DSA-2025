package P3_BinarySearch;
import java.util.*;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class P9_LC852_PeakIndexMountainArray {
    public static void main(String[] args){
        //call from here....
    }

    //Naive approach
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int peakElementIndex = -1;

        for(int index = 0; index < n-1; index++){
            if(arr[index] > arr[index+1]){
                peakElementIndex = index;
                break;
            }
        }

        return peakElementIndex;
    }

    public static int peakIndexInMountainArray2(int[] arr) {
        int n = arr.length;
        int startIndex = 0;
        int endIndex = n-1;

        while(startIndex < endIndex){
            int midIndex = startIndex + (endIndex - startIndex)/2;

            if(arr[midIndex] > arr[midIndex+1]){
                //decreasing part of the array i.e. 3 2
                endIndex = midIndex;
            }else{
                //increasing part of the array i.e 2 3
                startIndex = midIndex + 1;
            }
        }

        //both startIndex and endIndex points to same peakElement can return any of them.
        return startIndex;

    }
}
