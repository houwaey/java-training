package com.java.project;

public class RunApplication {
    public static void main(String[] args) {
        Employee employee = new Employee(50_000, 10);
        int wage = employee.calculateWage(20);
        System.out.println("Wage: " + wage);

        employee = new Employee(100_000, 20);
        wage = employee.calculateWage(20);
        System.out.println("Wage: " + wage);

        employee = new Employee(10_000);
        wage = employee.calculateWage();
        System.out.println("Wage: " + wage);
    }
}
