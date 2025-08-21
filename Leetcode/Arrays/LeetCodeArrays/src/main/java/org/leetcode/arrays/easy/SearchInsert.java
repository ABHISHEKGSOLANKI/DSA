package org.leetcode.arrays.easy;

import java.util.Scanner;

public class SearchInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Create array
        int[] arr = new int[n];

        // Step 3: Take input elements
        System.out.println("Enter " + n + " Integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();
        SearchInsert searchInsert = new SearchInsert();
        int searchInsertResult = searchInsert.searchInsert(arr, target);
        System.out.println(searchInsertResult);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i])
                return i;
            else if (target < nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
