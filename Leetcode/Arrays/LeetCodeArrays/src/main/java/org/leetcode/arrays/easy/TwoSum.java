package org.leetcode.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Two Sum
        TwoSum twoSum = new TwoSum();
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Take input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target number: ");
        int target = sc.nextInt();
        int[] twoSumResult = twoSum.twoSum(arr, target);
        System.out.println(Arrays.toString(twoSumResult));
    }
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for (int i=0; i<=nums.length; i++){
            for (int j = 1; j <= nums.length-1; j++) {
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
