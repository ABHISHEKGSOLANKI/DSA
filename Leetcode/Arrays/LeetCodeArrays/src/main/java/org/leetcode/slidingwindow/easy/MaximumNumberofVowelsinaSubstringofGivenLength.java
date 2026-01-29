package org.leetcode.slidingwindow.easy;

public class MaximumNumberofVowelsinaSubstringofGivenLength {

    /*
    *
    * Given a string s and an integer k,
    * return the maximum number of vowel letters in any substring of s with length k.
    *
    *Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
*
*
* Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
    * */


    public static void main(String[] args) {
        vowelsCount("abciiidef", 3);
    }

    private static int vowelsCount(String s, int k) {

        int maxVowelCount = 0;

        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                maxVowelCount++;
            }
        }

        int currentCount = maxVowelCount;

        // Slide the window
        for (int i = k; i < s.length(); i++) {

            char incoming = s.charAt(i);
            if (incoming == 'a' || incoming == 'e' || incoming == 'i' ||
                    incoming == 'o' || incoming == 'u') {
                currentCount++;
            }

            char outgoing = s.charAt(i - k);
            if (outgoing == 'a' || outgoing == 'e' || outgoing == 'i' ||
                    outgoing == 'o' || outgoing == 'u') {
                currentCount--;
            }

            maxVowelCount = Math.max(maxVowelCount, currentCount);

            // Early exit if maximum possible reached
            if (maxVowelCount == k) return k;
        }

        return maxVowelCount;
    }


}
