package com.java.project.generics;

public class MainSingle {
    public static void main(String[] args) {
        SingleGenericClass<String> single1 = new SingleGenericClass<>();
        single1.setData("John Doe");
        String stringData = single1.getData();
        System.out.println("String Data: " + stringData);

        SingleGenericClass<Integer> single2 = new SingleGenericClass<>();
        single2.setData(123);
        int intData = single2.getData();
        System.out.println("Int Data: " + intData);
    }
}
