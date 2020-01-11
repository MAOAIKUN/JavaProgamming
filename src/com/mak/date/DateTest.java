package com.mak.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH-mm-ss");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));
        System.out.println(simpleDateFormat.format(calendar.getTime()));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        long time = date.getTime();
        System.out.println(time);

        System.out.println("=====================================");

    }
}
