package com.example.helloworld.dp.easy;

public class ClimbingStairs {
    private int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 2; i < n; i++) {
            int t = a + b;
            a = b;
            b = t;
        }
        return b;
    }
}
