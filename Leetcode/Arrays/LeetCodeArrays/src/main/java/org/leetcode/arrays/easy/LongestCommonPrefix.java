package org.leetcode.arrays.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        // Step 2: Create array
        String[] arr = new String[n];

        // Step 3: Take input elements
        System.out.println("Enter " + n + " Strings:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String longestCommonPrefixResult = longestCommonPrefix.longestCommonPrefix(arr);
        System.out.println(longestCommonPrefixResult);
    }

    public String longestCommonPrefix(String[] strs) {
        String result = "";

        String base = strs[0];
        for (int i = 0; i <= base.length()-1 ; i++) {
            int count = 0;
            String prefix = base.substring(0,i+1);
            System.out.println("prefix "+prefix);
            for (int j = 0; j <= strs.length-1; j++) {
                if(strs[j].startsWith(prefix)){
                    count++;
                }
            }
            if(count == strs.length){
                result = prefix;
            }else{
                return result;
            }
        }
        return result;
    }

}
