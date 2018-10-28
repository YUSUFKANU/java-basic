package com.sda.example;

import java.util.Scanner;

/**
 */
public class InputOutputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj zmienną a: ");
        long variable1 = scanner.nextLong();
        System.out.print("Podaj zmienną b: ");
        long variable2 = scanner.nextLong();

        System.out.println("a + b = " + variable1 + variable2);
        System.out.println("a + b = " + (variable1 + variable2));
        System.out.println("a * b = " + variable1 * variable2);
        System.out.println("a / b = " + (variable1 - variable2));

    }
}
