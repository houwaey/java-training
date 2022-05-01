package com.java.project;

public class RunApplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(10);

        int wage = employee.calculateWage(20);
        System.out.println("Wage: " + wage);
    }
}
