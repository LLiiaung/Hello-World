package com.example.helloworld.dp.easy;

public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curMin = prices[0];
        for (int i = 1; i < prices.length; i++) {
            max = Math.max(max, prices[i] - curMin);
            curMin = Math.min(curMin, prices[i]);
        }
        return max;
    }
}
