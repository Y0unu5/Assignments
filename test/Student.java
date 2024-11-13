package com.test;

import java.util.ArrayList;
import java.util.function.Function;

public class Student {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }
}
class StudentGrade {
    public static void main(String[] args) {

        ArrayList<Student> students= new ArrayList<>();
        populate(students);
        Function<Student, String> function= s ->{
            int marks= s.marks;
            if (marks >= 80)
                return "A[Distinction]";
            else if (marks >= 60)
                return "B[First Class]";
            else if (marks >= 50)
                return "C[Second Class]";
            else if (marks >= 35)
                return "D[Third Class]";
            else
                return "E[Failed]";

        };
       for (Student student: students){
           System.out.println("Name: "+ student.name);
           System.out.println("Marks: "+ student.marks);
           System.out.println("Grade: "+ function.apply(student));
           System.out.println();
       }
    }

    static void populate(ArrayList<Student> students){
        students.add(new Student(80,"Innu"));
        students.add(new Student(90,"Yunus"));
        students.add(new Student(70,"Irshad"));
        students.add(new Student(60,"Kareem"));
        students.add(new Student(50,"Prem"));
        students.add(new Student(30,"Younus"));
    }
}
