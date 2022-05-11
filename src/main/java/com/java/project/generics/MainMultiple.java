package com.java.project.generics;

public class MainMultiple {
    public static void main(String[] args) {
        MultipleGenericClass<String, String> multiple1 = new MultipleGenericClass<>();
        multiple1.setKey("name");
        multiple1.setValue("John Doe");
        String stringKey = multiple1.getKey();
        String stringValue = multiple1.getValue();
        System.out.println("Key: " + stringKey + ", Value: " + stringValue);

        MultipleGenericClass<String, Integer> multiple2 = new MultipleGenericClass<>();
        multiple2.setKey("age");
        multiple2.setValue(21);
        String intKey = multiple2.getKey();
        int intValue = multiple2.getValue();
        System.out.println("Key: " + intKey + ", Value: " + intValue);
    }
}
