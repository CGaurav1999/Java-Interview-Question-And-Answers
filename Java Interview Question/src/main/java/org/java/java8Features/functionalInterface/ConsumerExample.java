package org.java.java8Features.functionalInterface;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> print = message -> System.out.println(message);
        print.accept("Hello World!"); // Output: Hello World!
    }
}
