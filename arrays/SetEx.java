package com.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(
                1, 3, 2, 4, 8, 9, 0));
        Set<Integer> b = new HashSet<Integer>(Arrays.asList(
                1, 3, 7, 5, 4, 0, 7, 5));
        Set<Integer> union = new HashSet<Integer>(set);
        union.addAll(b);
        System.out.print("Union of the two Set");
        System.out.println(union);
        Set<Integer> difference = new HashSet<Integer>(set);
        difference.removeAll(b);
        System.out.print("Difference of the two Set");
        System.out.println(difference);

        Set<Integer> intersection = new HashSet<Integer>(set);
        intersection.retainAll(b);
        System.out.print("Intersection of the two Set");
        System.out.println(intersection);

    }
}
