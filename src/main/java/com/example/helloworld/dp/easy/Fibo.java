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

    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        int res = fibo.fibo(4);
        System.out.println("res = " + res);
    }
}
