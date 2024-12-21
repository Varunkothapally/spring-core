package com.i18n.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class JavaI18nTest {
    public static void main(String[] args) {
        Locale locale = new Locale("hi", "IN");
        ResourceBundle rb = ResourceBundle.getBundle("messages", locale);
        System.out.println(rb.getString("home_title"));
    }
}
