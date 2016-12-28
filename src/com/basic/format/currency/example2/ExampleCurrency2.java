package com.basic.format.currency.example2;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by baze on 28/12/2559.
 */
public class ExampleCurrency2 {
    public static void main(String args[]){
        Locale locale = new Locale("th","TH");
        Currency currency = Currency.getInstance(locale);
        System.out.println(currency.getCurrencyCode());

        Currency currency2 = Currency.getInstance(Locale.FRANCE);
        System.out.println(currency2.getCurrencyCode());
    }
}
