package com.example.helloworld.dp.medium;

public class Knapsack01 {
    public static int testWeightBagProblem(int[] weight, int[] value, int bagWeight) {
        int[] dp = new int[bagWeight + 1];
        int max = 0;
        for (int i = 0; i < weight.length; i++) {
            for (int j = bagWeight; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j - weight[i]] + value[i], dp[j]);
                max = Math.max(max, dp[j]);
            }
        }
        return max;
    }
}
