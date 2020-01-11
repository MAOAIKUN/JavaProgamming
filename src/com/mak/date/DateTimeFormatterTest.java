package com.mak.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * DateTimeFormatter  日期格式化
 *
 * 感觉这个也会用到吧 像LocalDate等类的输出都和我们日常使用的差不多
 *
 */

public class DateTimeFormatterTest {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(localDate.format(dateTimeFormatter));
    }
}
