package org.leetcode.arrays.easy;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//
//        // Step 2: Create array
//        int[] arr = new int[n];
//
//        // Step 3: Take input elements
//        System.out.println("Enter " + n + " integers:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
        //Two Sum
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int bestTimeToBuyAndSellStockResult = bestTimeToBuyAndSellStock.maxProfit(null);
        System.out.println(bestTimeToBuyAndSellStockResult);
    }
    public int maxProfit(int[] prices1) {
        int[] prices = {1,2};
        int profit = 0;//[7,1,5,3,6,4]
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i] < prices[i+1] && prices[i] <= prices[minIndex] ) {
                minIndex = i;
                maxIndex = i;
            }
            else if (prices[i] > prices[i+1] && prices[i] >= prices[maxIndex])
                maxIndex = i;
        }
        profit = prices[maxIndex] - prices[minIndex];
        return profit;
    }
}
