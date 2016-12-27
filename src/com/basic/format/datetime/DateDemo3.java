package com.basic.format.datetime;

import java.util.Date;
public class DateDemo3 {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        String str = String.format("Current Date/Time : %tc", date );

        System.out.printf(str);
    }
}