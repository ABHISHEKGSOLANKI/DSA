package org.leetcode.slidingwindow.easy;

public class MinimumRecolorstoGetKConsecutiveBlackBlocks {


    /*
    * You are given a 0-indexed string blocks of length n, where blocks[i] is either 'W' or 'B', representing the color of the ith block. The characters 'W' and 'B' denote the colors white and black, respectively.

You are also given an integer k, which is the desired number of consecutive black blocks.

In one operation, you can recolor a white block such that it becomes a black block.

Return the minimum number of operations needed such that there is at least one occurrence of k consecutive black blocks.
    *
    *
    * Input: blocks = "WBBWWBBWBW", k = 7
Output: 3
Explanation:
One way to achieve 7 consecutive black blocks is to recolor the 0th, 3rd, and 4th blocks
so that blocks = "BBBBBBBWBW".
It can be shown that there is no way to achieve 7 consecutive black blocks in less than 3 operations.
Therefore, we return 3.
    *
    *
    *
    *
    *
    *
    * */

    public static void main(String[] args) {
        minimumRecolors("WBBWWBBWBW", 7);
    }
    public static int minimumRecolors(String b, int k) {
        int max=Integer.MAX_VALUE;
        int c=0;
        if(b.length()==k){
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)=='W'){
                    c++;
                }
            }
            return c;
        }
        for(int i=0;i<=b.length()-k;i++){
            int count=0;
            for(int j=i;j<i+k;j++){
                if(b.charAt(j)=='W'){
                    count++;
                }
            }
            max=Math.min(max,count);
        }
        return max;
    }
}
