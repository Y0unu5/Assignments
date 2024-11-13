package com.arrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Person {
    private int id;
    private String fName;
    private String lName;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Person(int id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Person> people= new ArrayList<>();
        people.add(new Person(22,"Mk","Karadi"));
        people.add(new Person(23,"Peter","Parker"));
        people.add(new Person(24,"Salman","Khan"));
        people.add(new Person(25,"Amitabh","Bacchan"));
        people.add(new Person(26,"Kajol","Devgan"));

        for (Person person: people){
            System.out.println("Person: "+ person.getId()+ ", "+person.getfName() +","+person.getlName());
        }
        //Comparing FirstName & LastName
        Comparator<Person> comparingByName= Comparator.comparing(Person::getfName).thenComparing(Person::getlName);

        ArrayList<Person> sortedList= people.stream()
                .sorted(comparingByName)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(sortedList);
    }
}
