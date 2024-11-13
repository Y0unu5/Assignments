package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.function.Function;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        //String to a java.util.Date
        SimpleDateFormat format= new SimpleDateFormat("dd-MMM-yyy hh:mm:ss a", Locale.ENGLISH);
        String date= "01-January-2024 10:28:33 AM";
        Date d= format.parse(date);
        System.out.println(d);

        //String to a java.time.LocalDate
        LocalDate date1= LocalDate.parse("2023-10-09");
        System.out.println(date1);

        Function<String, Integer> function= s -> s.length();
        System.out.println(function.apply("Younus"));

        Function<Integer, Integer> f= i -> i*i;
        System.out.println(f.apply(89));
    }
}
