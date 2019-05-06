package com.kgisl.qs1.map;

import java.util.Map;
import java.util.zip.Inflater;
import java.util.HashMap;
import java.util.Iterator;

/**
 * demo
 */

// Java program to demonstrate iteration over
// Map.entrySet() entries using for-each loop

class MapDemo {
    public static void main(String[] arg) {

        Map<String, Integer> hi = new HashMap<String, Integer>();
        hi.put("hai", 1025);
        hi.put("ok", 757);
        hi.put("tamil", 858);
        hi.put("nonok", 55445);
        // using for-each loop for iteration over Map.entrySet()
        System.out.println("using for-each loop for iteration over Map.entrySet()");
        for (Map.Entry<String, Integer> ok : hi.entrySet())

            System.out.println("name" + ok.getKey() + "r.no  " + ok.getValue());
        System.out.println("***************************************************************");
        /*
         * Iterating over keys or values using keySet() and values() methods
         * Map.keySet() method returns a Set view of the keys contained in this map and
         * Map.values() method returns a collection-view of the values contained in this
         * map. So If you need only keys or values from the map, you can iterate over
         * keySet or values using for-each loops. Below is the java program to
         * demonstrate it.
         */ // using keySet() for iteration over keys
        for (String abc : hi.keySet())
            System.out.println("name " + abc);
        // using values() for iteration over keys
        for (Integer abcd : hi.values())
            System.out.println(" \t values" + abcd);
        System.out.println("***************************************************************");

        System.out.println("Iterating using iterators over Map.Entry<K, V>");

        /*
         * Iterating using iterators over Map.Entry<K, V> This method is somewhat
         * similar to first one. In first method we use for-each loop over Map.Entry<K,
         * V>, but here we use iterators. Using iterators over Map.Entry<K, V> has it’s
         * own advantage,i.e. we can remove entries from the map during iteration by
         * calling iterator.remove() method.
         */
        Iterator<Map.Entry<String, Integer>> itat = hi.entrySet().iterator();

        while (itat.hasNext()) {
            Map.Entry<String, Integer> entry = itat.next();
            System.out.println("name" + entry.getKey() + "    " + entry.getValue());

        }

        /*
         * Using forEach(action) method : In Java 8, you can iterate a map using
         * Map.forEach(action) method and using lambda expression. This technique is
         * clean and fast.
         */
        System.out.println("  // forEach(action) method to iterate map ");

        hi.forEach((l, m) -> System.out.println(l + "<= name" + "rno=> " + m));
        /*
         * Iterating over keys and searching for values (inefficient) Here first we loop
         * over keys(using Map.keySet() method) and then search for value(using
         * Map.get(key) method) for each key.This method is not used in practice as it
         * is pretty slow and inefficient as getting values by a key might be
         * time-consuming.
         */

        // Java program to demonstrate iteration
        // over keys and searching for values
 
    }
}
