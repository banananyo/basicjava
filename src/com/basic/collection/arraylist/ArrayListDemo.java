package com.basic.collection.arraylist;

import java.util.*;
public class ArrayListDemo {
    public static void oneLineForEach(ArrayList list){
        list.forEach( e -> System.out.print(e+" "));
    }
    public static void printList(ArrayList list){
        System.out.print("list: [");
        for(int i=0; i<list.size() ; i++){
            System.out.print(list.get(i));
            if(i<list.size()-1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void printListIterator(ArrayList list){
        Iterator itr = list.iterator();
        int i=0;
        System.out.print("list: [");
        while(itr.hasNext()){
            System.out.print(itr.next());
            if(i<list.size()-1) System.out.print(", ");
            i++;
        }
        System.out.println("]");
    }
    public static void printListForEach(ArrayList list){
        System.out.print("list: [");
        for (Iterator itr = list.iterator(); itr.hasNext(); ) {
            System.out.print(itr.next());

            if (!itr.hasNext()) {
                // Last item...
            }else{
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    public static void main(String args[]) {
        // create an array list
        ArrayList al = new ArrayList();
        System.out.println("Initial size of al: " + al.size());

        // add elements to the array list
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");
        System.out.println("Size of al after additions: " + al.size());

        // display the array list
        System.out.println("Contents of al: " + al);

        // Remove elements from the array list
        al.remove("F");
        al.remove(2);
        System.out.println("Size of al after deletions: " + al.size());
        System.out.println("Contents of al: " + al);

        printList(al);
        printListIterator(al);
        printListForEach(al);
        oneLineForEach(al);

    }

}