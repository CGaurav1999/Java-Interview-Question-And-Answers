package org.java.exception;

class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor with a cause only
    public CustomException(Throwable cause) {
        super(cause);
    }
}

public class CustomExceptionTest {

    // Method to throw CustomException with a message only
    public static void throwExceptionWithMessage() throws CustomException {
        throw new CustomException("This is a custom exception with a message.");
    }

    // Method to throw CustomException with a message and cause
    public static void throwExceptionWithMessageAndCause() throws CustomException {
        try {
            // Simulate an underlying cause
            throw new NullPointerException("This is the cause");
        } catch (NullPointerException e) {
            throw new CustomException("Custom exception with a message and cause.", e);
        }
    }

    // Method to throw CustomException with a cause only
    public static void throwExceptionWithCause() throws CustomException {
        throw new CustomException(new ArithmeticException("This is the cause of the custom exception"));
    }

    public static void main(String[] args) {
        try {
            // Testing the exception with just a message
            throwExceptionWithMessage();
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        try {
            // Testing the exception with a message and a cause
            throwExceptionWithMessageAndCause();
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }

        try {
            // Testing the exception with a cause only
            throwExceptionWithCause();
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }
}

