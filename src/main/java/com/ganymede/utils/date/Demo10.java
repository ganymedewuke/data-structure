package com.ganymede.utils.date;

import java.time.Clock;

/**
 * Java 8的Clock时钟类
 * Java 8增加了一个Clock时钟类用于获取当时的时间戳，或当前时区下的日期时间信息。
 * 以前用到System.currentTimeInMillis()和TimeZone.getDefault()的地方都可用Clock替换。
 */
public class Demo10 {
    public static void main(String[] args) {
        // Returns the current time based on your system clock and set to UTC.
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock.millis());

        //Returns time based on system clock zone
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock.millis());
    }
}
