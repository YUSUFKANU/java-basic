package com.sda.example;

import java.util.Scanner;

/**
 */
public class DoWhileLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        while (n < 0) {
            System.out.print("Wprowadź liczbę dodatnią: ");
            n = scanner.nextInt();
        }

        do {
            System.out.println("Odliczanie .... " + n);
            n--;
        } while (n >= 1);
    }
}
