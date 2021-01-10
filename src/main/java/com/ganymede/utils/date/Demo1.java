package com.ganymede.utils.date;

import java.time.LocalDate;

/**
 * Java 8中获取今天的日期
 * Java 8 中的 LocalDate 用于表示当天日期。和java.util.Date不同，它只有日期，不包含时间。当你仅需要表示日期时就用这个类。
 */
public class Demo1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("今天的日期： " + today);
    }
}
