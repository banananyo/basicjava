package com.basic.format.datetime;

import java.util.Date;
public class DateDemo5 {

    public static void main(String args[]) {
        // Instantiate a Date object
        Date date = new Date();

        // display formatted date
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
    }
}