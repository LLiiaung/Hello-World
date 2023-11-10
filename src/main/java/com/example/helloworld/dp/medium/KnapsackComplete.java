package com.example.helloworld.dp.medium;

public class KnapsackComplete {
    public static int testCompletePack(int[] weight, int[] value, int bagWeight) {
        int[] dp = new int[bagWeight + 1];
        int max = 0;
        for (int i = 0; i < weight.length; i++) {
            for (int j = weight[i]; j <= bagWeight; j++) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
