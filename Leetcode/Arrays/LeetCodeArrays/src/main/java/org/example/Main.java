package org.example;

import org.leetcode.arrays.easy.TwoSum;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Two Sum
        TwoSum twoSum = new TwoSum();
        int[] nums = {2,7,11,15};
        int[] twoSumResult = twoSum.twoSum(nums, 9);
        System.out.println(Arrays.toString(twoSumResult));
    }
}