package com.nirmaan.yantra.arrays.easy;

public class A01_FindMaximumElement {

    /*
    * Given an integer array arr, find and return the largest element present in the array.
    * input: arr = [5, 2, 9, 1, 7]
    * output: 9
    * */
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println(findMax(arr));
    }
}
