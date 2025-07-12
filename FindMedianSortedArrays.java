
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).



Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.


Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-106 <= nums1[i], nums2[i] <= 106
 */

import java.util.Arrays;

public class FindMedianSortedArrays {
    public static void main(String[] args){

        int[] num1 = {1,2,5, 7}; // 1,2,4,5,6,7
        int[] num2 = {4, 6};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
    public static double findMedianSortedArrays(int[] num1, int[] num2) {

        if(num1.length == 0 && num2.length == 0) {
            return 0;
        } else if (num1.length == 0){
            return median(num2);
        } else if (num2.length == 0) {
            return median(num1);
        } else {
              return median(mergedArr( num1, num2));
        }
    }

    public static double median(int[] num){
        if( num.length % 2 == 0) {
            int minInd = num.length/2;
            return (double) (num[minInd-1] + num[minInd]) / 2;
        } else {
            return num[num.length/2];
        }
    }

    //O(n2)
    public static int [] mergedArr(int size, int[] num1, int[] num2) {
        int [] x = new int[size];
        int m = 0;
        for (int k : num1) {
            x[m++] = k;
        }
        for(int k : num2){
            x[m++] = k;
        }
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(x[i]>x[j]){
                    int t = x[i];
                    x[i] = x[j];
                    x[j] = t;
                }
            }
        }
        return x;
    }

    //O(n log(n))
    public static int[] mergedArr(int[] num1, int[] num2) {
        int[] merged = new int[num1.length + num2.length];
        System.arraycopy(num1, 0, merged, 0, num1.length);
        System.arraycopy(num2, 0, merged, num1.length, num2.length);

        Arrays.sort(merged); // Sorts in ascending order
        return merged;
    }

}
