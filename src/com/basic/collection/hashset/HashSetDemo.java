package com.basic.collection.hashset;

import java.util.*;
public class HashSetDemo {
    public static void printIterator(Set set){
        System.out.println("print use Iterator");
        Iterator itr = set.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+", ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // create a hash set
        HashSet hs = new HashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);
        printIterator(hs);
    }
}