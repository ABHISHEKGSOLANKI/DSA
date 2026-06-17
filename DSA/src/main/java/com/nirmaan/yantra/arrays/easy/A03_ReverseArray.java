package com.nirmaan.yantra.arrays.easy;

import java.util.Arrays;

public class A03_ReverseArray {

    /*
    * Given an integer array arr, reverse the array in-place without using another array.
    * input: arr = [1, 2, 3, 4, 5]
    * output: [5, 4, 3, 2, 1]
    * */
    public static int[] reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
