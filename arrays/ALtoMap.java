package com.arrays;

import java.util.*;

public class ALtoMap  {

    public static void main(String[] args) {
        List<String> list= new ArrayList<>();
        list.add("Yunus");
        list.add("Sameer");
        list.add("Jon");
        list.add("Robb");
        Map<Integer,String > map=new HashMap<>();
        list.forEach(n -> {
            System.out.println(n);
        });

    }
}
