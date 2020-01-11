package com.mak.date;

import java.time.Period;
import java.time.YearMonth;

/**
 *
 * YearMonth 日期不包括天
 *
 * 其他方法不说了
 *
 * lengthOfYear()   返回一年的天数
 * lengthOfMonth()  返回一月的天数
 */

public class YearMonthTest {
    public static void main(String[] args) {

        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth);
        System.out.println(yearMonth.lengthOfYear());
        System.out.println(yearMonth.lengthOfMonth());
    }
}
