package org.leetcode.arrays.day2;

public class MaximumSubarraySumWithOneDeletion {

    public static void main(String[] args) {
        int[] arr = {1, -1, -1, 3};


        int result = arr[0];
        int nodelete = arr[0];
        int onedelete = arr[0];

        for(int i =1 ; i < arr.length ; i++){
            onedelete = Math.max(onedelete +arr[i], nodelete);

            nodelete = Math.max(nodelete + arr[i], arr[i]);

            result = Math.max(nodelete,Math.max(onedelete,result));
        }
    }
}
