package com.fbs.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Calendar;
@Component
public class Remainder {
    @Value("${id}")
    private int id;
    @Value("${remainder}")
    private String remainder;
    @Value("${priority}")
    private int priority;
    @Autowired
    private Calendar calendar;

    @Override
    public String toString() {
        return "Remainder{" +
                "id=" + id +
                ", remainder='" + remainder + '\'' +
                ", priority=" + priority +
                ", calendar=" + calendar.getTime() +
                '}';
    }
}
