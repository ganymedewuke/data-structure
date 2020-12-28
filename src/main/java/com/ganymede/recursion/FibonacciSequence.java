package com.ganymede.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 当n很大的时候可能会出现数字溢出，所以我们需要用结果对1000000007求余
 * <p>
 */
public class FibonacciSequence {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    /**
     * 此中解法，在n很大时可能会溢出
     * 斐波那契数列递归的时候会造成大量的重复计算
     *
     * @param n
     * @return
     */
    public int fibByRec(int n) {
        if (n < 2)
            return n;
        return fibByRec(n - 1) + fibByRec(n - 2);
    }

    int constant = 1000000007;

    public int fibByRec2(int n) {
        return fibByRec2(n, new HashMap<>());
    }


    /**
     * 需配置 -Xss64m , 否则会栈溢出
     * @param n
     * @param map
     * @return
     */
    public int fibByRec2(int n, Map<Integer, Integer> map) {
        if (n < 2)
            return n;

        if (map.containsKey(n))
            return map.get(n);

        int first = fibByRec2(n - 1, map) % constant;
        map.put(n - 1, first);

        int second = fibByRec2(n - 2, map) % constant;
        map.put(n - 2, second);

        int res = (first + second) % constant;
        map.put(n, res);
        return res;
    }

    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        int res = fibonacciSequence.fib(100_0000);
        System.out.println(res);

        int res2 = fibonacciSequence.fibByRec2(100_0000);
        System.out.println(res2);
    }
}
