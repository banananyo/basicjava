package com.basic.format.number;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
public class NumberFormatDemo1{
    public static void main(String args[]){
        NumberFormat numberFormat =
                NumberFormat.getCurrencyInstance(new Locale("da", "DK"));
        numberFormat.setCurrency(Currency.getInstance("EUR"));

        String currencyString = numberFormat.format(120.99);
        System.out.println(currencyString);
    }
}