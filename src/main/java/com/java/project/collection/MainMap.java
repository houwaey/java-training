package com.java.project.collection;

import java.util.HashMap;
import java.util.Map;

public class MainMap {
    public static void main(String[] args) {
        Customer c1 = new Customer("John Doe", "john@email.com");
        Customer c2 = new Customer("Amy Watson", "amy@email.com");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        System.out.println(map);
//        System.out.println(map.get("amy@email.com")); // this is super-fast
//        System.out.println(map.get("dummy@email.com")); // this will return null

//        Customer unknown = new Customer("Unknown", "");
//        System.out.println(map.getOrDefault("dummy@email.com", unknown));

//        System.out.println(map.containsKey("john@email.com"));

//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }

//        System.out.println(map.values());

//        for (Map.Entry<String, Customer> entry : map.entrySet()) {
//            System.out.println("Key: " + entry + ", Value: " + entry.getValue());
//        }
    }
}
