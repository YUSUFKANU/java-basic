package com.sda.example;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 */
public class WhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = -1;
            while (n < 0) {
                System.out.print("Wprowadź liczbę dodatnią: ");
                n = scanner.nextInt();
            }
            while (n >= 1) {
                System.out.println("Odliczanie .... " + n);
                n--;
            }
        } catch (InputMismatchException ex) {
            System.out.print("Wprowadziłeś liczbę ujemną!");
        }

    }
}
