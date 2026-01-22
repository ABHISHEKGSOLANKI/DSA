package org.leetcode.arrays.day2;

import java.util.ArrayList;
import java.util.*;

public class SubarraySumEqualsK {

    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   // base case

        int sum = 0;
        int count = 0;

        for (int num : nums) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }


    }
}
