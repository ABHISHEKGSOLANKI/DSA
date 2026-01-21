package org.leetcode.arrays.day2;

import java.util.*;

public class FindAllAnagramsInAString {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.computeIfAbsent(key, V -> new ArrayList<>()).add(word);
        }
    }
}
