package com.basic.format.currency.example1;

// Java program explaining Currency class methods
// getInstance(), getCurrencyCode(),getDefaultFractionDigits()
// getDisplayName(), getSymbol()
import java.util.*;
public class ExampleCurrency1
{
    public static void main(String[] args)
    {
        // Use of getInstance() method to 'AUD' instance
        Currency c1 = Currency.getInstance("AUD"); //Australian Dollar
        Currency c2 = Currency.getInstance("JPY");  //Japan Yen
        Currency c3 = Currency.getInstance("USD");  //Japan Yen

        // Use of getCurrencyCode() method
        String cCode1 = c1.getCurrencyCode();
        String cCode2 = c2.getCurrencyCode();
        String cCode3 = c3.getCurrencyCode();
        System.out.println("Australian Dollar code : " + cCode1);
        System.out.println("Japan Yen code : " + cCode2);
        System.out.println("United States code : " + cCode3);
        System.out.println("");

        // Use of getDefaultFractionDigits() method
        int D1 = c1.getDefaultFractionDigits();
        System.out.println("AUD Fraction digits : " + D1);

        int D2 = c2.getDefaultFractionDigits();
        System.out.println("JPY fraction digits : " + D2);

        int D3 = c3.getDefaultFractionDigits();
        System.out.println("USD fraction digits : " + D3);
        System.out.println();

        // Use of getDisplayName() method
        System.out.println("AUD Display : "+c1.getDisplayName());
        System.out.println("JPY Display : "+c2.getDisplayName());
        System.out.println("USD Display : "+c3.getDisplayName());
        System.out.println("");

        // Use of getSymbol() method
        System.out.println("AUD Symbol : "+c1.getSymbol());
        System.out.println("JPY Symbol : "+c2.getSymbol());
        System.out.println("USD Symbol : "+c3.getSymbol());

    }
}