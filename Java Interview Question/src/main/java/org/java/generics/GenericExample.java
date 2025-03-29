package org.java.generics;

// Generic class
class Box<T> {
    private T value;

    // Constructor
    public Box(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Setter method
    public void setValue(T value) {
        this.value = value;
    }

    // Generic method inside the generic class
    public <U> void printWithAnotherType(U anotherValue) {
        System.out.println("Stored value: " + value + ", Another value: " + anotherValue);
    }

    @Override
    public String toString() {
        return "Box{" + "value=" + value + '}';
    }
}

// Generic method outside the class
class Utility {
    public static <T> void printBox(Box<T> box) {
        System.out.println("Box contains: " + box.getValue());
    }
}

// Main class to test generics
public class GenericExample {
    public static void main(String[] args) {
        // Integer Box
        Box<Integer> intBox = new Box<>(10);
        intBox.setValue(20);
        System.out.println(intBox.getValue()); // Output: 20

        // String Box
        Box<String> strBox = new Box<>("Hello");
        System.out.println(strBox); // Output: Box{value=Hello}

        // Using generic method
        intBox.printWithAnotherType("Extra Data");

        // Utility method for printing
        Utility.printBox(intBox);
        Utility.printBox(strBox);
    }
}

