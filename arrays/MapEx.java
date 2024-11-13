package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MapEx {
    public static void main(String[] args) {
        int a[]={1, 13, 4, 1, 41, 31, 31, 4, 13, 2};
        List<Integer> list= new ArrayList<>();
        for (int i=0; i<a.length;i++){
            list.add(a[i]);
        }

        HashMap<Integer, Integer> h = new HashMap();

        // counting occurrence of numbers
        for (int i = 0; i < list.size(); i++) {
            h.putIfAbsent(list.get(i), Collections.frequency(
                    list, list.get(i)));
        }
        System.out.println(h);
    }


}
