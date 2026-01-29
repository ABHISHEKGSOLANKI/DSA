package org.leetcode.slidingwindow.easy;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;//[7,1,5,3,6,4]
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            profit = Math.max(prices[i] - buyPrice, profit);
        }
        
        System.out.println(profit);
    }
}
