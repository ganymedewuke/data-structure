package com.ganymede.utils.date;

import java.time.LocalDate;

/**
 * Java 8中获取年、月、日信息
 */
public class Demo2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        System.out.println("Year : " + year);
        System.out.println("Month : " + month);
        System.out.println("Day : " + day);
    }
}
