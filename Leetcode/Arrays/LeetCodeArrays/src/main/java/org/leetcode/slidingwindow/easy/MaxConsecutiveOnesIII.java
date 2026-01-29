package org.leetcode.slidingwindow.easy;

public class MaxConsecutiveOnesIII {

    /*
    *Given a binary array nums and an integer k,
    * return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
     *
    *Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
Output: 6
Explanation: [1,1,1,0,0,1,1,1,1,1,1]
Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
    * */

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        longestOnes( nums, 2);
    }

    public static int longestOnes(int[] nums, int k) {
        int left = 0, maxLen = 0;
        int countOfZeroes = 0;

        for(int right = 0; right < nums.length; right++) {
            if(nums[right] == 0) countOfZeroes++;

            while(countOfZeroes > k) {
                if(nums[left] == 0) countOfZeroes--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
