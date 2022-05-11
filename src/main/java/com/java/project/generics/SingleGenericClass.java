package com.java.project.generics;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SingleGenericClass<T> {
    private T data;
}
