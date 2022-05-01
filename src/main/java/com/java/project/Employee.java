package com.java.project;

public class Employee {
    private final int baseSalary;
    private final int hourlyRate;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage() {
        return calculateWage(0);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
