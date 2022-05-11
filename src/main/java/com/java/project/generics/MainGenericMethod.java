package com.java.project.generics;

public class MainGenericMethod {
    public static void main(String[] args) {
        String data1 = getValue("John Doe");
        int data2 = getValue(21);
        double data3 = getValue(123.45);

        System.out.println("Data 1: " + data1);
        System.out.println("Data 2: " + data2);
        System.out.println("Data 3: " + data3);
    }

    public static <T> T getValue(T genericData) {
        return genericData;
    }
}
