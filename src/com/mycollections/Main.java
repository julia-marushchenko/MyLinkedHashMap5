/**
 *  Java program to demonstrate LinkedHashMap to add elements one by another.
 */

package com.mycollections;

import java.util.LinkedHashMap;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating an empty map.
        LinkedHashMap<Integer, Integer> myLinkedMap = new LinkedHashMap<>();

        // Adding elements to myLinkedMap.
        myLinkedMap.put(2, 3);
        myLinkedMap.put(3, 4);
        myLinkedMap.put(4, 5);
        myLinkedMap.put(5, 6);
        myLinkedMap.put(6, 7);

        // Printing values and keys of myLinkedMap to console.
        System.out.println(myLinkedMap);

        // Removing pair with key equals 4.
        myLinkedMap.remove(4);

        // Printing values and keys of myLinkedMap to console.
        System.out.println(myLinkedMap);

        // Adding new pair of elements.
        myLinkedMap.put(7, 8);

        // Printing values and keys of myLinkedMap to console.
        System.out.println(myLinkedMap);

        // Removing all elements from myLinkedMap.
        myLinkedMap.clear();

        // Checking if myLinkedMap is empty.
        System.out.println(myLinkedMap.isEmpty());

    }
}