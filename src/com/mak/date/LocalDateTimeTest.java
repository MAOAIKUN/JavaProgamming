package com.mak.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * LocalDateTime 日期时间
 *
 * 方法在其他的类里面基本都出现了
 *
 * toLocalDate()  转换成日期
 * toLocalTime()  转换成时间
 */

public class LocalDateTimeTest {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);
        LocalTime localTime = localDateTime.toLocalTime();
        System.out.println(localTime);

    }
}
