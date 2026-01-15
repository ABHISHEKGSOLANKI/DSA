package org.leetcode.arrays.day1;

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
        int[] prices = {7,1,5,3,6,4};
        int profit = 0;//[7,1,5,3,6,4]
        int buyPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i] < buyPrice) {
                buyPrice = prices[i];
            }
            profit = Math.max(prices[i] - buyPrice, profit);
        }
        return profit;
    }
}
