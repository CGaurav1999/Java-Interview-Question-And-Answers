package org.java.java8Features.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(10)); // Output: true
        System.out.println(isEven.test(15)); // Output: false
    }
}

