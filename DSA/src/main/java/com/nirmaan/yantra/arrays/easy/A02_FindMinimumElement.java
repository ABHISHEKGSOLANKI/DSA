package com.nirmaan.yantra.arrays.easy;

public class A02_FindMinimumElement {

    /*
    * Given an integer array arr, find and return the smallest element present in the array.
    * input: arr = [5, 2, 9, 1, 7]
    * output: 9
    * */
    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        System.out.println(findMin(arr));
    }
}
