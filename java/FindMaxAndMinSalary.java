package com.java;

import java.util.*;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private double salary;
    private String department;
    private String gender;


    public Employee(String name, double salary, String department, String gender) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
public class FindMaxAndMinSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 70000, "Technical","Male"),
                new Employee("Bob", 85000, "Technical","Male"),
                new Employee("Charlie", 120000,"HR","Male"),
                new Employee("David", 95000,"Dev","Male"),
                new Employee("Eve", 60000,"Dev","Female")
        );

        Map<String, Double> averageSalaryByGender = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary)));

        Map<String, Long> employeeCountByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));


        employees.stream()
                        .filter( emp -> emp.getDepartment().equals("Technical"))
                                .forEach(employee -> employee.setSalary(employee.getSalary()*1.5));
        employees.forEach(System.out::println);
        OptionalDouble minSal= employees.stream().mapToDouble(Employee::getSalary).min();
        OptionalDouble maxSal= employees.stream().mapToDouble(Employee::getSalary).max();

        Optional<Employee> secondHighestSal= employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).findFirst();

        System.out.println("Minimum Salary: " + minSal.getAsDouble());
        System.out.println("Maximum Salary: " + maxSal.getAsDouble());
        System.out.println("Secod Highest sal"+ secondHighestSal);
        System.out.println("Avg sal by gender"+ averageSalaryByGender );
        System.out.println("Employee Count By dept:"+ employeeCountByDepartment);
    }
}
