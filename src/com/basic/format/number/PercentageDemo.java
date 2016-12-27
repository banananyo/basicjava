package com.basic.format.number;


import java.text.NumberFormat;
import java.util.Locale;
public class PercentageDemo{
    public static void main(String agrs[]){
        Locale locale = new Locale("da", "DK");
        NumberFormat percentageFormat = NumberFormat.getPercentInstance(locale);
        String percentage = percentageFormat.format(0.999);
        System.out.println(percentage);
    }
}