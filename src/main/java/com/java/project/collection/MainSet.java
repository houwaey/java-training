package com.java.project.collection;

import java.util.*;

public class MainSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
//        System.out.println(set);

        // we can also remove the duplicates in List using Set
        List<String> list = Arrays.asList("a", "b", "b", "b", "c");
//        System.out.println(list);
        Set<String> removeDuplicates = new HashSet<>(list);
//        System.out.println(removeDuplicates);

        // Union - we can combine also 2 Set using addAll
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "c", "d"));
        set1.addAll(set2);
//        System.out.println(set1);

        // Difference - check what we have in the first set, and we don't have in the 2nd set
        set1.removeAll(set2);
//        System.out.println(set1);
    }
}
