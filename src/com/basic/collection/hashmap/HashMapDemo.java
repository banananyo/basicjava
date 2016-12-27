package com.basic.collection.hashmap;

import java.util.*;
public class HashMapDemo {
    public static void toEntrySet(Map map){
        System.out.println("print by use EntrySet");
        // Get a set of the entries
        Set set = map.entrySet();
        // Get an iterator
        Iterator i = set.iterator();
        // Display elements
        while(i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }
    public static void toEntrySet2(Map map){
        System.out.println("print by use EntrySet2");
        for (Object entry : map.entrySet())
        {
            System.out.println("["+((Map.Entry)entry).getKey() + ", " + ((Map.Entry)entry).getValue()+"]");
        }
        System.out.println();
    }
    public static void toOneLineForEach(Map map){
        System.out.println("print by use one line foreach");
        map.forEach( (k, v) -> System.out.println("["+k+", "+v+"]"));
        System.out.println();
    }
    public static void main(String args[]) {

        // Create a hash map
        HashMap hm = new HashMap();

        // Put elements to the map
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        toEntrySet(hm);
        toEntrySet2(hm);
        toOneLineForEach(hm);


        // Deposit 1000 into Zara's account
        double balance = ((Double)hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + hm.get("Zara"));
    }
}