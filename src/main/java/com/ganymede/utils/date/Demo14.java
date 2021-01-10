package com.ganymede.utils.date;

import java.time.LocalDate;

/**
 * 如何在Java 8中检查闰年
 */
public class Demo14 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        if (today.isLeapYear()) {
            System.out.println("This year is Leap year");
        } else {
            System.out.println(today.getYear() + " is not a Leap year");
        }
    }
}
