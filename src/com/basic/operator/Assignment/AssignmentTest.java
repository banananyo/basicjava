package com.basic.operator.Assignment;

public class AssignmentTest {

    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 0;

        c = a + b;
        System.out.println("c = a + b = " + c );

        c += a ;
        System.out.println("c += a  = " + c );

        c -= a ;
        System.out.println("c -= a = " + c );

        c *= a ;
        System.out.println("c *= a = " + c );

        a = 10;
        c = 15;
        c /= a ;
        System.out.println("c /= a = " + c );

        a = 10;
        c = 15;
        c %= a ; //5
        System.out.println("c %= a  = " + c );

        c <<= 2 ; //20
        System.out.println("c <<= 2 = " + c );

        c >>= 2 ; //5
        System.out.println("c >>= 2 = " + c );

        c >>= 2 ; //1
        System.out.println("c >>= 2 = " + c );

        c &= a ; // c = 0001 & 1010 = 0000
        System.out.println("c &= a  = " + c );

        c ^= a ; // c = 0000 ^ 1010 = 1010
        System.out.println("c ^= a   = " + c );

        c |= a ; // c = 1010 | 1010 = 1010
        System.out.println("c |= a   = " + c );
    }
}