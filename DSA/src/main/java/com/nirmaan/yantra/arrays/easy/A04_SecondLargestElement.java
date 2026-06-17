package com.nirmaan.yantra.arrays.easy;

import java.util.Arrays;

public class A04_SecondLargestElement {

    /*
    * Given an integer array, find the second largest distinct element.
    * If no second largest element exists, return -1.
Example 1
Input: [10, 5, 20, 8]
Numbers in sorted order: 20, 10, 8, 5
Largest = 20
Second Largest = 10
Output:10
    * */
    public static int secondLargestElement(int[] arr){
        if (arr.length == 0 || arr.length == 1)
            return -1;
        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                return arr[i];
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};

        System.out.println(secondLargestElement(arr));
    }
}
