package com.basic.format.currency.basic;

import java.util.Currency;
import java.util.Locale;

public class BasicCurrencyExample {
    public static void main(String[] args) {
        Currency curr = Currency.getInstance(Locale.UK);

        System.out.println("The currency of United Kingdom is " + curr.getCurrencyCode());
    }
}
