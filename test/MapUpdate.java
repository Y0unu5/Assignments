package com.test;

import java.util.*;
import java.util.stream.Stream;

public class MapUpdate {
    public static void main(String[] args) {
        Map<String , String> map= new HashMap<>();
        map.put("Effective Java", "Kathy Sierra");
        map.put("Spring in Action", "Craig Walls");
        map.put("Hibernate in Action", "Gavin King");
        map.put("Pro Angular", "Freeman");
        map.put("Pro Spring Boot", "Felipe Gutierrez");

        //Only modify if key already exists in the map
        map.computeIfPresent("Effective Java", (key, val)-> "Joshua Bloch");

        //Only modify if key doesn't exist in the map
        map.computeIfAbsent("Core Java", (value) -> "Kathy Sierra");

       // map.entrySet().iterator().forEachRemaining(System.out::println);

        Iterator it= map.entrySet().iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++++++");
        //To print keys & values of a Map in Java 8
        map.keySet().iterator().forEachRemaining(System.out::println);
        System.out.println("++++++++++++++++++++");
        Iterator itr= map.keySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //Using Collection.stream() and Stream.forEach()
        map.values().stream().forEach(System.out::println);
        //Using Stream.of() and  Collection.toArray() and Stream.forEach()
        Stream.of(map.keySet().toArray())
                .forEach(System.out::println);

        //How many ways are there to initialize a Set ?
        //Anonymous Cls
        Set<String> strings= new HashSet<>(){
            {
                add("India");
                add("Bangalore");
                add("Mumbai");
            }
        };
        // instance of another Collection
        Set<String> set= new HashSet<>(Arrays.asList("India","Australia", "Sri Lanka"));
       // set.stream().iterator().forEachRemaining(System.out::println);
    }
}
