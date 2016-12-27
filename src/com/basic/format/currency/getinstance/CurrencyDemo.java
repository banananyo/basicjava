package com.basic.format.currency.getinstance;

import java.util.*;

public class CurrencyDemo {

    public static void main(String args[]) {

        // create a currency object with specified locale
        Locale locale = Locale.GERMANY;
        Currency curr = Currency.getInstance(locale);

        // print currency's code
        System.out.println("Locale's currency code:" + curr.getCurrencyCode());

    }
}