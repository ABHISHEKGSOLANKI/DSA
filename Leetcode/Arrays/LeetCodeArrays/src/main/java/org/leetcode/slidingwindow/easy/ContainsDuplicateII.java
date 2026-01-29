package org.leetcode.slidingwindow.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicateII {

    /*
    * Given an integer array nums and an integer k, return true if there are
    * two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
    *Input: nums = [1,2,3,1], k = 3
Output: true
    * */

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        containsNearbyDuplicate(nums, k);

    }

    public static  boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // Remove the element that is now outside the window
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            // Try to add the current element. If it fails, a duplicate exists.
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}
