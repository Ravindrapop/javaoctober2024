package com.rsg.practice;

public class Employee {
	
	    private String name;
	    private String gender;
	    private double salary;

	    // Constructor
	    public Employee(String name, String gender, double salary) {
	        this.name = name;
	        this.gender = gender;
	        this.salary = salary;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public double getSalary() {
	        return salary;
	    }

}
