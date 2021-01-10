package com.ganymede.utils.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 如何用Java判断日期是早于还是晚于另一个日期
 * 另一个工作中常见的操作就是如何判断给定的一个日期是大于某天还是小于某天？在Java 8中，
 * LocalDate类有两类方法isBefore()和isAfter()用于比较日期。调用isBefore()方法时，如果给定日期小于当前日期则返回true。
 */
public class Demo11 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        if (tomorrow.isAfter(today)) {
            System.out.println("之后的日期： " + tomorrow);
        }

        LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
        if (yesterday.isBefore(today)) {
            System.out.println("之前的日期： " + yesterday);
        }

    }
}
