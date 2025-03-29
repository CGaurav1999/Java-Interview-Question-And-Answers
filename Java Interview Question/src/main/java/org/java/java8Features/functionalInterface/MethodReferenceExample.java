package org.java.java8Features.functionalInterface;

import java.util.function.Consumer;

public class MethodReferenceExample {
    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        Consumer<String> printer = MethodReferenceExample::printMessage;
        printer.accept("Hello Method Reference!"); // Output: Hello Method Reference!
    }
}

