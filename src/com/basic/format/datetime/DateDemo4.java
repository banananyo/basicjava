package com.basic.format.datetime;

import java.util.Date;
public class DateDemo4 {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date:", date);
    }
}