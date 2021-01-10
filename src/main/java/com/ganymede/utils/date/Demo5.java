package com.ganymede.utils.date;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * Java 8中检查像生日这种周期性事件
 */
public class Demo5 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();

        LocalDate date2 = LocalDate.of(2018, 1, 10);
        MonthDay birthday = MonthDay.of(date2.getMonth(), date2.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(date1);

        if (currentMonthDay.equals(birthday)) {
            System.out.println("今天是你的生日！");
        } else {
            System.out.println("你的生日还没有到！");
        }
    }
}
