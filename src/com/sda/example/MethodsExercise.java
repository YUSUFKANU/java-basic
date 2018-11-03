package com.sda.example;

/**
 */
public class MethodsExercise {
    public static void main(String[] args) {
        int multiple = multipleOfTwoVariables(10, 20);
        printMultiple(multiple);
    }

    private static void printMultiple(int multiple) {
        System.out.println("Wynik mnożenia liczb wynosi: " + multiple);
    }

    static int multipleOfTwoVariables(int a, int b) {
        return a * b;
    }
}
