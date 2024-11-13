package com.java;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEx {
    private String name;
    private String role;

    public PredicateEx(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "PredicateEx{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Predicate<Integer> lower= (i)-> i <= 10;
        Predicate<Integer> greater= (i)-> i < 20;
        boolean res= lower.and(greater).test(9);
        System.out.println(res);
        boolean res1= lower.and(greater).negate().test(10);
        System.out.println(res1);

        List<PredicateEx> list= new ArrayList<>();
        list.add(new PredicateEx("John", "admin"));
        list.add(new PredicateEx("Yunus", "junior dev"));
        List<PredicateEx> admins= process(list, (PredicateEx u)-> u.getRole().equals("admin"));
        System.out.println(admins);
        List admin= list.stream().filter((use) -> use.getRole().equals("admin")).collect(Collectors.toList());
        System.out.println(admin);

    }

    private static  List<PredicateEx> process(List<PredicateEx> users,
                                              Predicate<PredicateEx> predicate
    ){

        List<PredicateEx> user= new ArrayList<>();
        for (PredicateEx us: users){
            if (predicate.test(us))
                user.add(us);
        }
        return user;
    }
}
