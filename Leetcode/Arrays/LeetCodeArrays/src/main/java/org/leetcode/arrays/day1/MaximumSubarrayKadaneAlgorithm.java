package org.leetcode.arrays.day1;

public class MaximumSubarrayKadaneAlgorithm {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int total = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (total < 0)
                total = 0;

            total += nums[i];

            if (total > result)
                result = total;
        }
        System.out.println(result);
    }
}
