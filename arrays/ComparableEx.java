package com.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx implements Comparable<ComparableEx>{
    private double rating;
    private int year;
    private String movieName;

    @Override
    public int compareTo(ComparableEx o) {
        return o.year - this.year;
    }

    public ComparableEx(String movieName, double rating, int year) {
        this.rating = rating;
        this.year = year;
        this.movieName = movieName;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    public String getMovieName() {
        return movieName;
    }

    public static void main(String[] args) {
        ArrayList<ComparableEx> list = new ArrayList<>();
        list.add(new ComparableEx("Force Awakens", 8.3, 2015));
        list.add(new ComparableEx("Star Wars", 8.7, 1977));
        list.add(new ComparableEx("Empire Strikes Back", 8.8, 1980));
        list.add(new ComparableEx("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);
        System.out.println("Movies after sorting : ");

        for (ComparableEx ex: list){
            System.out.println("Movie name: " + ex.getMovieName() + "Rating: "+ ex.getRating() + " Year: "+ ex.getYear());
        }
    }
}
