package com.nirmaan.yantra.arrays.easy;

import java.util.Arrays;

public class A05_CheckSortedArray {

    /*
    * Given an integer array, determine whether the array is sorted in non-decreasing order.
    * Return true if sorted, otherwise false.
Example 1
Input: arr = [1, 2, 3, 4, 5]
Output: true
    * */
    public static boolean checkSortedArray(int[] arr){
        if (arr.length == 0 || arr.length == 1)
            return true;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length-1 && arr[i] > arr[i+1]) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 4, 5};

        System.out.println(checkSortedArray(arr));
    }
}
