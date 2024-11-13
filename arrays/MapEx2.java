package com.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapEx2 {
    public static void main(String[] args) {
        // Java program demonstrating use of keySet()

        // making map of Integer keys and String values
        Map<Integer, String> map = new HashMap<>();

        // adding the key-value pairs to map
        map.put(1, "Geeks");
        map.put(2, "For");
        map.put(3, "Geeks");
        map.put(50,"MKHSJ");


        for (Map.Entry<Integer, String> entry: map.entrySet()){
            if (entry.getKey() > 2){
                System.out.println(entry.getKey() + " "+ entry.getValue());
            }
        }
        // below are the different and simple ways out of
        // many to iterat e over the keySet()

        // iterating the keySet() using iterator
        Iterator<Integer> itr = map.keySet().iterator();

        Iterator iterator= map.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+ " ");
        }
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();

        // iterating the keySet() using for loop
        for (Integer key : map.keySet()) {
            System.out.print(key + " ");
        }

        System.out.println();

        // iterating over the keySet() by converting the map
        // to the string
        System.out.println(map.keySet());


    }
}
