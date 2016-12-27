package com.basic.staticKeyword;

public class CounterStatic{
    static int count=0;//will get memory only once and retain its value

    CounterStatic(){
        count++;
        System.out.println(count);
    }

    public static void main(String args[]){

        CounterStatic c1=new CounterStatic();
        CounterStatic c2=new CounterStatic();
        CounterStatic c3=new CounterStatic();

    }
}