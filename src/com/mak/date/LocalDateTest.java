package com.mak.date;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * LocalDate 本地日期
 *
 * 常用的获取方法，构造方法是私有的
 * now()
 * now(Clock)
 * of(year,month,day)
 *
 * getMonth() : 将返回一个枚举值    可使用getMonthValue()去获得阿拉伯数字
 * getDayOfWeek()   :   获得一个枚举值
 *
 *里面很多操纵日期的方法 很灵活
 *
 */

public class LocalDateTest {

    public static void main(String[] args) {

        //jdk8 之后
        //本地日期 会根据时区自动转换
        LocalDate localDate = LocalDate.now();
        //with开头的方法多半是修改日期中的项的
        //plus开头的方法顾名思义是在所选项的基础上加
        //minus ......减
        //plus(val,val)指定一个加
        //minus(val,val)
        //ChronoUnit 实现TemporalUnit接口  包含日期的可选项
        localDate = localDate.withDayOfMonth(2).withYear(2019).plusDays(3)
                .plusMonths(3).minusDays(2).plus(2, ChronoUnit.WEEKS).minus(1,ChronoUnit.DAYS);
        //判断是否为闰年
        //is开头的方法显然是做判断的
        boolean leapYear = localDate.isLeapYear();
        System.out.println(leapYear);
        System.out.println(localDate);
        System.out.println("年份："+localDate.getYear()+"月份值："+localDate.getMonthValue()+"一月中的哪一天："+localDate.getDayOfMonth());
        //getMonth()获取的是枚举值 月份的英文单词
        System.out.println("世纪："+localDate.getEra()+"一周中的哪一天："+localDate.getDayOfWeek()+"一年中的哪一天："+localDate.getDayOfYear());
        // CE 公元纪年 getDayOfWeek()获取的也是枚举值
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek.getValue());
        System.out.println("==================================================");
        LocalDate localDate1 = LocalDate.now(Clock.systemUTC());
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2020, 1, 11);
        System.out.println(localDate2);
    }
}
