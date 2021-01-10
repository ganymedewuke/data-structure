package com.ganymede.utils.date;

import java.time.LocalTime;

/**
 * Java 8中获取当前时间
 */
public class Demo6 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("获取当时的时间，不含有日期： " + time);
    }
}
