package org.java.java8Features.functionalInterface;

import java.util.function.Function;

public class FunctionChainingExample {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy2 = n -> n * 2;
        Function<Integer, Integer> add3 = n -> n + 3;

        Function<Integer, Integer> combined = multiplyBy2.andThen(add3);
        System.out.println(combined.apply(5)); // Output: 13
    }
}

