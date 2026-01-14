package org.leetcode.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Two Sum
        PlusOne plusOne = new PlusOne();
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Take input elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] plusOneResult = plusOne.plusOne(arr);
        System.out.println(Arrays.toString(plusOneResult));
    }
    public int[] plusOne(int[] nums){//[9 9 9]
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums; // No carry, done
            }
            nums[i] = 0; // Set to 0 and carry over
        }

        // If we reach here, it means all were 9 → need a new array
        int[] nums1 = new int[nums.length + 1];
        nums1[0] = 1; // Example: 999 → 1000
        return nums1;
    }
}
