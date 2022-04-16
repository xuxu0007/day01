package com.xh;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

public class Application {

    public static void main(String[] args) throws ParseException {
//        Student student = new Student();
//        student.test();
//        DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        Date date = new Date();
//        String format = simpleDateFormat.format(date);
//        System.out.println(format);
//        Date parse = simpleDateFormat.parse("2022-04-01 05:10:22");
//
//        Calendar instance = Calendar.getInstance();
//        System.out.println(instance.getTime());
        /*
        String str1 = "a" + 1 + 2;
        int str2 = 'A' + 1 + 2;
        System.out.println(str1);
        System.out.println(str2);

        Collection<String> list = new ArrayList<>();
        */
        Person person = new Student();
        person.test();

    }
}