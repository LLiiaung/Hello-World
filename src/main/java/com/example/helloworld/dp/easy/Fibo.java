package com.example.helloworld.dp.easy;

public class Fibo {
    // 1 2 3 5 8
    // input index  output fibo
    int[] arr = new int[50];
    private int fibo(int n) {
        if (n < 3) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        return arr[n] = fibo(n - 1) + fibo(n - 2);
    }

    private int fibo1(int n) {
        if (n < 3) {
            return n;
        }
        int a = 1, b = 2;
        for (int i = 3; i <= n; i++) {
            int t = a + b;
            a = b;
            b = t;
        }
        return b;
    }

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        int res = fibo.fibo(4);
        System.out.println("res = " + res);
    }
}
