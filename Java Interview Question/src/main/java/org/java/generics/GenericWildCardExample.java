package org.java.generics;

import java.util.Arrays;
import java.util.List;

class Calculator {
    // Method using ? extends Number (accepts List of any subclass of Number)
    public static double sumOfNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number num : numbers) {
            sum += num.doubleValue();  // Works for Integer, Double, etc.
        }
        return sum;
    }
}

public class GenericWildCardExample {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        // Works with both Integer and Double lists
        System.out.println("Sum of integers: " + Calculator.sumOfNumbers(intList)); // Output: 15.0
        System.out.println("Sum of doubles: " + Calculator.sumOfNumbers(doubleList)); // Output: 7.5
    }
}

