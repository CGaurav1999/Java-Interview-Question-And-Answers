package org.java.java8Features.functionalInterface;

@FunctionalInterface
interface A {
    void methodA();
}

@FunctionalInterface
interface B extends A {
    // No new abstract methods allowed
}

public class Example2 {
    public static void main(String[] args) {

    }
}
