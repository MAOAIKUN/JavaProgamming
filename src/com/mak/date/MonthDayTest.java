package com.mak.date;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;


/**
 *
 * MonthDay 没有年份的日期
 *
 * 常用的获取(创建)方法
 * now()
 * now(Clock)
 * from(LocalDate)  这里的参数其实不是localDate 而是它实现的接口Temporal的父接口TemporalAccessor
 * of(month,day)
 * of(Month,day)
 *
 */

public class MonthDayTest {

    public static void main(String[] args) {

        MonthDay monthDay = MonthDay.now();
        System.out.println(monthDay);
        System.out.println(monthDay.getMonth()+" "+monthDay.getMonthValue()+" "+monthDay.getDayOfMonth());

        LocalDate localDate = LocalDate.now();
        MonthDay monthDay1 = MonthDay.from(localDate);
        System.out.println(monthDay1);
        MonthDay monthDay2 = MonthDay.now(Clock.systemUTC());
        System.out.println(monthDay2);
        MonthDay monthDay3 = MonthDay.of(1, 11);
        System.out.println(monthDay3);
        MonthDay monthDay4 = MonthDay.of(Month.JANUARY, 11);
        System.out.println(monthDay4);
        MonthDay monthDay5 = MonthDay.parse("--01-11");
        System.out.println(monthDay5);

    }
}
