package com.ganymede.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Test {
    int constant = 1000000007;

    public int fib(int n) {
        return fib(n, new HashMap());
    }

    public int fib(int n, Map<Integer, Integer> map) {
        if (n < 2)
            return n;
        if (map.containsKey(n))
            return map.get(n);
        int first = fib(n - 1, map) % constant;
        map.put(n - 1, first);
        int second = fib(n - 2, map) % constant;
        map.put(n - 2, second);
        int res = (first + second) % constant;
        map.put(n, res);
        return res;
    }

    public static void main(String[] args) {
       Test test = new Test();
       int i = test.fib(100_0000);
        System.out.println(i);
    }
}
