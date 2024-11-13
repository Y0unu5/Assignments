package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
    private int rollNo;
    private String studentName;

    public Student(int rollNo, String studentName) {
        this.rollNo = rollNo;
        this.studentName = studentName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
class SortByRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getRollNo() - o2.getRollNo();
    }
}

class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getStudentName().compareTo(o2.getStudentName());
    }
}
public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
        list.add(new Student(10,"Yunus"));
        list.add(new Student(1,"Apple"));
        list.add(new Student(5,"Sam"));
        list.add(new Student(9,"Carr"));
        list.add(new Student(16,"Umbrella"));
// Display message on console for better readability
        System.out.println("Unsorted");
        for (Student student : list) {
            System.out.println(student);
        }

        list.sort(new SortByRollNo());
        System.out.println("\nSorted by rollno");

        for (Student student: list){
            System.out.println(student);
        }

    }
}
