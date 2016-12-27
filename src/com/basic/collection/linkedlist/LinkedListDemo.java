package com.basic.collection.linkedlist;

import java.util.*;
public class LinkedListDemo {
    public static void oneLineForEach(LinkedList list){
        list.forEach( e -> System.out.print(e+" "));
    }
    public static void printList(LinkedList list){
        System.out.print("list: [");
        for(int i=0; i<list.size() ; i++){
            System.out.print(list.get(i));
            if(i<list.size()-1) System.out.print(", ");
        }
        System.out.println("]");
    }
    public static void printListIterator(LinkedList list){
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
    public static void printListForEach(LinkedList list){
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
        // create a linked list
        LinkedList ll = new LinkedList();

        // add elements to the linked list
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1, "A2");
        System.out.println("Original contents of ll: " + ll);

        // remove elements from the linked list
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contents of ll after deletion: " + ll);

        // remove first and last elements
        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after deleting first and last: " + ll);

        // get and set a value
        Object val = ll.get(2);
        ll.set(2, (String) val + " Changed");
        System.out.println("ll after change: " + ll);

        printList(ll);
        printListIterator(ll);
        printListForEach(ll);
        oneLineForEach(ll);
    }
}
