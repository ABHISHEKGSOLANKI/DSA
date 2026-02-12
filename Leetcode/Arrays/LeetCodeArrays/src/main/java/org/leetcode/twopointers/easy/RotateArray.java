package org.leetcode.twopointers.easy;

public class RotateArray {

    /*
    * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:*/

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }

    public static void rotate(int[] nums, int k) {
        int left = 0;
        int right = nums.length;

        while (right > left){
            int temp = nums[left];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }

        left = 0;
        right = k-1;
        while (right > left){
            int temp = nums[left];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }

        left = k;
        right = nums.length -1;
        while (right > left){
            int temp = nums[left];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }

    }
}
