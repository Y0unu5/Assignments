package com.java;

import java.util.ArrayList;
import java.util.List;


public class Person
{
    private String name;
    private Integer age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class GFG{
 /*
    public static int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public static int compareByAge(Person a,Person b){
        return a.getAge().compareTo(b.getAge());
    }
*/
    public int compareByName(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
    public int compareByAge(Person a, Person b){
        return a.getAge().compareTo(b.getAge());
    }
    public static void main(String[] args) {
        List<Person> people= new ArrayList<>();
        people.add(new Person("Yunus",24));
        people.add(new Person("Muzz",26));
        people.add(new Person("Prem",26));
        people.add(new Person("Yunus",24));

        GFG gfg= new GFG();

        //Static method ref
       // Collections.sort(people, GFG::compareByName);
        // Ref to instance meth of particular obj.
        people.sort(gfg::compareByName);
        System.out.println("Sort by name :");

        people.stream().map(Person::getName).forEach(System.out::println);

      //  Collections.sort(people, GFG::compareByAge);
        people.sort(gfg::compareByAge);
        System.out.println("Sort by Age :");

        people.stream().map(Person::getAge).forEach(System.out::println);

        List<String> strings= new ArrayList<>();
        strings.add("Yunus");
        strings.add("Apple");
        strings.add("hotel");
        strings.add("watch");
        //Reference to an instance method of an arbitrary object of a particular type
        strings.sort(String::compareToIgnoreCase);

        strings.forEach(System.out::println);

    }
}