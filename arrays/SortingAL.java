package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingAL {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(24);
        list.add(40);
        list.add(1);
        list.add(34);
        list.add(50);
        System.out.println("Before Sorting :"+ list);
        //Collections.sort(list);
       // System.out.println("After Sorting "+ list);

        //Using Comparator.
      //  Collections.sort(list, new SortAl());
        //System.out.println("Af ter Sorting "+ list);
        //Using Java 8 Sort
       // list.sort(Comparator.naturalOrder());

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        //Stream API sorted meth
        List<Integer> sortedList= list.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(sortedList);



        List<Integer> revList= list
                .stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(revList);


    }
}
class SortAl implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String a1= o1.toString();
        String a2= o2.toString();
        return a1.compareTo(a2); //ascending and a2.compareTo(a1); descending
    }

}