package org.leetcode.slidingwindow.easy;

public class NumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold {

    /*
    *
    *Given an array of integers arr and two integers k and threshold,
    * return the number of sub-arrays of size k and average greater than or equal to threshold.
    *
    *
    * Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
Output: 3
Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively.
* All other sub-arrays of size 3 have averages less than 4 (the threshold).
    * */


    public static void main(String[] args) {
        int[] nums = {2,2,2,2,5,5,5,8};
        numOfSubarrays(nums,3,4);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int subSetCount = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        if (sum/k >= threshold)
            subSetCount++;

        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i-k];
            if (sum/k >= threshold)
                subSetCount++;
        }

        return subSetCount;
    }
}
