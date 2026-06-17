package com.nirmaan.yantra.arrays.leetCode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B01_TwoSum {

    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
            int complement = target - arr[i];
            if (map.containsKey(complement) && map.get(complement) != i){
                return new int[] {i, map.get(complement)};
            }
        }
        return new int[]{};
    }

    //Brute force method
    public static int[] twoSumBruteForce(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == target)
                    return new int[] {i, j};
            }
        }

        return new int[] {};
    }


    public static void main(String[] args) {
        int[] arr = {2, 7, 1, 5};

        System.out.println(Arrays.toString(twoSumBruteForce(arr, 3)));
    }
}
