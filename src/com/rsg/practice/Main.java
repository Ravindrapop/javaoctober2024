package com.rsg.practice;
import java.util.*;
import java.util.stream.*;



public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "Female", 60000),
            new Employee("Bob", "Male", 45000),
            new Employee("Charlie", "Male", 70000),
            new Employee("Diana", "Female", 80000),
            new Employee("Eve", "Female", 50000)
        );

        // Find employees with salary > 50k and count based on gender
        Map<String, Long> result = employees.stream()
            .filter(e -> e.getSalary() > 50000) // Filter by salary > 50k
            .collect(Collectors.groupingBy(
                Employee::getGender, // Group by gender
                Collectors.counting() // Count employees in each group
            ));

        // Print the result
        System.out.println(result);
    }
}
