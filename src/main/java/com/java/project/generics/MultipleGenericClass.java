package com.java.project.generics;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MultipleGenericClass<K, V> {
    private K key;
    private V value;
}
