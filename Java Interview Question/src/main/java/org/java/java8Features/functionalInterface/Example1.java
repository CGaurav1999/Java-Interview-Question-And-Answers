package org.java.java8Features.functionalInterface;

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

public class Example1 {
    public static void main(String[] args) {
        Calculator calculator = (a, b) -> a + b;
        System.out.println(calculator.add(5, 3)); // Output: 8
    }
}

