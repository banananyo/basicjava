package com.basic.format.number;

import java.text.NumberFormat;

/**
 * Created by baze on 28/12/2559.
 */
public class CurrencyInstanceDemo {
    public static void main(String args[]){
        // Get a default NumberFormat instance.
        NumberFormat numForm = NumberFormat.getCurrencyInstance();

        // Format some decimals using the pattern supplied above.
        String dest1 = numForm.format(22.3423D);
        System.out.println("dest1 = " + dest1);

        String dest2 = numForm.format(64000D);
        System.out.println("dest2 = " + dest2);
    }
}
