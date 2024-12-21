package com.fbs.helper;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;

import java.util.Calendar;

public class CalendarFactoryBean implements FactoryBean<Calendar> {
    private int year;
    private int month;
    private int day;
    private int hour;
    private int minute;

    public CalendarFactoryBean(int year,int month,int day,int hour, int minute) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public Calendar getObject() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hour, minute);
        return calendar;
    }

    @Override
    public Class<?> getObjectType() {
        return Calendar.class;
    }
}
