package com.ganymede.utils.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Java 8计算一年前或一年后的日期
 * 利用minus()方法计算一年前的日期
 */
public class Demo9 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate previousYear = today.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前的日期： " + previousYear);

        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("一年后的日期： " + nextYear);
    }
}
