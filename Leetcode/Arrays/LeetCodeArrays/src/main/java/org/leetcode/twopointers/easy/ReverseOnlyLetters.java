package org.leetcode.twopointers.easy;

public class ReverseOnlyLetters {

    /*
    *Given a string s, reverse the string according to the following rules:

All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.
    *
    * Example 1:

Input: s = "ab-cd"
Output: "dc-ba"
Example 2:

Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"
Example 3:

Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"
    *
    * */

    public static void main(String[] args) {
        reverseOnlyLetters("Test1ng-Leet=code-Q!");
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while (left < right){

            while (left < right && !Character.isLetter(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetter(s.charAt(right))) {
                right--;
            }

            char temp = s.charAt(left);
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        String reversedStr = new String(chars);
        return reversedStr;
    }

}
