package P3_BinarySearch;
import java.util.*;
//https://leetcode.com/problems/median-of-two-sorted-arrays/description/
public class P4_LC4_MedianOfTwoSortedArray {
    public static void main(String[] args){
        //call from here...
    }


    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double median = -1;
        int m = nums1.length;
        int n = nums2.length;
        int[] result = new int[m + n];
        int resultLength = result.length;

        //merge sort will merge both the sorted array into single array
        merge(nums1, nums2, m, n, result);
        int midIndex = resultLength/2;
        System.out.println(Arrays.toString(result));
        if(resultLength % 2 == 0){
            median = (double)(result[midIndex] + result[midIndex-1])/2;
        }else{
            median = result[midIndex];
        }
        return median;
    }

    private static void merge(int[] nums1, int[] nums2, int m, int n, int[] result){
        int i = 0,j = 0, k = 0;

        //traversing both the array and putting the smaller into the result array
        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                result[k++] = nums1[i++];
            }else{
                result[k++] = nums2[j++];
            }
        }

        //if one of the array is completely traversed and other array left of with some few elements
        while(i < m)  result[k++] = nums1[i++];
        while(j < n)  result[k++] = nums2[j++];
    }
}
