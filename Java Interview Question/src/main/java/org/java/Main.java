package org.java;

import java.io.IOException;
import java.util.function.DoubleToIntFunction;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int fun(){
        try {
            throw new IOException("Exception in try block");
        }
        finally {
            throw new ArithmeticException("Exception in finally block");
        }

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        try{
            System.out.println(fun());
        }catch (Exception e){
            System.out.println("e");
        }

    }
}