package com.java.project;

public class RunApplication {
    public static void main(String[] args) {
        int baseSalary = 50_000;
        int extraHours = 20;
        int hourlyRate = 10;

        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println("Wage: " + wage);
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
