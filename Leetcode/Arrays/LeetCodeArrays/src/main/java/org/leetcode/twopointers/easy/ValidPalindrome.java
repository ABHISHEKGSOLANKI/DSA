package org.leetcode.twopointers.easy;

public class ValidPalindrome {

    /*
    *A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
    *
    * Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
    *
    * */

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String str) {
        str = str.replace(" ", "").toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetterOrDigit(str.charAt(i)))
                stringBuilder.append(str.charAt(i));
        }
        int right = stringBuilder.length()-1;
        for (int left = 0; left < stringBuilder.toString().length()/2; left++) {
            if (stringBuilder.charAt(left) != stringBuilder.charAt(right))
                return false;

            right--;
        }

        return true;
    }

}
