package com.test;

import java.util.Arrays;
import java.util.List;

public class StreamEx {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,20,33,45,52,16);
        int sum= list.stream()
                .filter(n -> n % 2==0)
                .map(n -> n*2)
                .reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
