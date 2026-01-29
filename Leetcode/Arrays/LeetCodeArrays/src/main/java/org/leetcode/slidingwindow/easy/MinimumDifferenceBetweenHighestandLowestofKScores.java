package org.leetcode.slidingwindow.easy;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {

    /*
    *
    * You are given a 0-indexed integer array nums, where nums[i] represents the score of the ith student. You are also given an integer k.

Pick the scores of any k students from the array so that the difference between the highest and the lowest of the k scores is minimized.

Return the minimum possible difference.
*
*
* Input: nums = [9,4,1,7], k = 2
Output: 2
Explanation: There are six ways to pick score(s) of two students:
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 4 = 5.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 1 = 8.
- [9,4,1,7]. The difference between the highest and lowest score is 9 - 7 = 2.
- [9,4,1,7]. The difference between the highest and lowest score is 4 - 1 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 4 = 3.
- [9,4,1,7]. The difference between the highest and lowest score is 7 - 1 = 6.
The minimum possible difference is 2.
*
    *
    * */

    public static void main(String[] args) {
        int[] nums = {9,4,1,7};
        minimumDifference(nums, 2);
    }

    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE, j = k - 1;
        for(int i = 0; i + j < nums.length; i++) {
            ans = Math.min(ans, nums[i + j] - nums[i]);
        }
        return ans;
    }
}
