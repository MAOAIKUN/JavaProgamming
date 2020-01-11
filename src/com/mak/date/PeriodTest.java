package com.mak.date;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 *
 * Period 间隔  两个日期相差
 *
 * between()
 *
 * getYears(val1,val2)  val2是被减数
 * getMonths()
 * getDays()
 * 分别获得相差多少年，多少月，多少天，跟正常的减法一样，不够减要想高位借位
 */

public class PeriodTest {
    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.of(2010, 2, 25);
        Period period = Period.between(localDate1,localDate);
        System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());



    }
}
