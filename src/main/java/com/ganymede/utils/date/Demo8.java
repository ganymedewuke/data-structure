package com.ganymede.utils.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Java 8如何计算一周后的日期
 * LocalDate日期不包含时间信息，它的plus()方法用来增加天、周、月，ChronoUnit类声明了这些时间单位。由于LocalDate也是不变类型，返回后一定要用变量赋值。
 * 可以看到新日期离当天日期是7天，也就是一周。你可以用同样的方法增加1个月、1年、1小时、1分钟甚至一个世纪，更多选项可以查看Java 8 API中的ChronoUnit类
 */
public class Demo8 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("今天的日期为： " + today);

        LocalDate nexweek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后的日期为：" + nexweek);
    }
}
