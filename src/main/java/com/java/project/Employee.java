package com.java.project;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage() {
        return calculateWage(0);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
