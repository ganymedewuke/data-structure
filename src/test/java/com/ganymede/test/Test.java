package com.ganymede.test;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println("data structure!");

        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
