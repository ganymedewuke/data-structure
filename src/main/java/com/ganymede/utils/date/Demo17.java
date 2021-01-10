package com.ganymede.utils.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Java 8中如何使用预定义的格式化工具去解析或格式化日期
 */
public class Demo17 {
    public static void main(String[] args) {
        String dayAfterTommorrow = "20180205";
        LocalDate formatted = LocalDate.parse(dayAfterTommorrow,
                DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dayAfterTommorrow+"  格式化后的日期为:  "+formatted);
    }
}
