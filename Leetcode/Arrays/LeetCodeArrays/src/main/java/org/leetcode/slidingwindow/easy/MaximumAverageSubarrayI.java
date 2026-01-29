package org.leetcode.slidingwindow.easy;

public class MaximumAverageSubarrayI {

    /*
    * You are given an integer array nums consisting of n elements, and an integer k.
    * Find a contiguous subarray whose length is equal to k that has the maximum average value
    * and return this value. Any answer with a calculation error less than 10-5 will be accepted.
    *
    * Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
    * */


    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i-k] + nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum / k);
    }



}
