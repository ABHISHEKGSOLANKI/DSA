package org.leetcode.slidingwindow.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubstringsofSizeThreewithDistinctCharacters {

    /*
    * A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.
    *
    *
    * Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
The only good substring of length 3 is "xyz".
    *
    * */

    public static void main(String[] args) {
        countGoodSubstrings("aababcabc");
    }

    public static int countGoodSubstrings(String s) {
        int n = s.length();
        if(n < 3) return 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int left=0, count = 0;
        for(int right = 0; right<n; right++) {
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);

            // window size is 3
            if(right - left + 1 == 3) {
                if(map.size() == 3) count++;
                int freq = map.get(s.charAt(left));
                if(freq == 1) {
                    map.remove(s.charAt(left));
                } else {
                    map.put(s.charAt(left), freq-1);
                }
                left++;
            }
        }
        return count;
    }
}
