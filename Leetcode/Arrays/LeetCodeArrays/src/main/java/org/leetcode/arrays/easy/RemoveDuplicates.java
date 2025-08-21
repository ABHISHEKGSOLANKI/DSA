package org.leetcode.arrays.easy;

import java.util.*;

public class RemoveDuplicates {
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
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int removeDuplicatesResult = removeDuplicates.removeDuplicates(arr);
        System.out.println(removeDuplicatesResult);
    }
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int index = 0;
        for (Integer num : set){
            nums[index] = num;
            index++;
        }
        System.out.println(Arrays.toString(nums));
        return set.size();
    }
}
