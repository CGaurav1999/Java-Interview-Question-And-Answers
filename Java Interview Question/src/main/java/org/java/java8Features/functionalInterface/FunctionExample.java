package org.java.java8Features.functionalInterface;

import java.util.function.Function;
//Function<T, R> takes an input of type T and returns a result of type R

public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = str -> str.length();
        System.out.println(lengthFunction.apply("Hello")); // Output: 5
    }
}

