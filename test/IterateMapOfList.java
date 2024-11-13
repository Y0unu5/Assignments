package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IterateMapOfList
{
    public static void main(String[] args) {
        Map<String, List<String>> map= new HashMap<>();

        List<String> listOfAnimals= Arrays.asList("Bear","Tiger","Lion","Deer","Cheetah");
        map.put("Animals",listOfAnimals);

        List<String> mammals=Arrays.asList("Cat", "Dog", "Monkey", "Cow");
        map.put("Mammals", mammals);

        List<String> birds= Arrays.asList("Crow", "Parrot", "Peacock", "Flamingo");
        map.put("Birds", birds);

        List<String> listOfRep= Arrays.asList("Lizard", "Turtle", "Crocodile", "Python");
        map.put("Reptiles",listOfRep);
        map.forEach(
                (key, val)-> System.out.println(
                        "Category name : " + key + "\t\t"
                                + "List of Animals under the Category : "+ val
                )
        );
    }
}
