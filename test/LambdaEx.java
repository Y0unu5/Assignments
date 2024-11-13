package com.test;

import java.util.function.Function;

public class LambdaEx {
    public static void main(String[] args) {
        String s="Younus Son of Murtuza Sab";
        Function<String, String> f= g -> g.replaceAll(" ","");
        System.out.println(f.apply(s));

        Function<String, Integer> function= v -> v.length() - v.replaceAll(" ","").length();
        System.out.println("No of spaces"+ function.apply(s));
    }
}
