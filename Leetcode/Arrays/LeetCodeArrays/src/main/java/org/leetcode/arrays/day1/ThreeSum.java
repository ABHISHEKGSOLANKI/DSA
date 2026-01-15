package org.leetcode.arrays.day1;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Arrays.sort(nums);
        Set<List<Integer>> listOfList = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                for (int k = nums.length-1; k >= 0; k--) {
                    if (nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);

                        listOfList.add(list);
                    }else {
                        break;
                    }
                }
            }
        }
        List<List<Integer>> resultList = new ArrayList<>(listOfList);

    }
}
