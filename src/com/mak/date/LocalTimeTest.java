package com.mak.date;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

/**
 *
 * localTime 时间
 *
 * ChronoField 实现了 TemporalField   是一个enum记录了关于时间的一些选项
 *
 */

public class LocalTimeTest {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        localTime = localTime.with(ChronoField.HOUR_OF_DAY,20).with(ChronoField.MINUTE_OF_HOUR,30);
        System.out.println(localTime);
    }
}
