package com.ganymede.utils.date;

import java.time.LocalDate;

/**
 * Java 8中判断两个日期是否相等
 */
public class Demo4 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2021, 1, 10);

        if (date1.equals(date2)) {
            System.out.println("时间相等");
        } else {
            System.out.println("时间不等");
        }
    }
}
