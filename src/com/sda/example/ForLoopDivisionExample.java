package com.sda.example;

import java.util.Scanner;

/**
 */
public class ForLoopDivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int n = scanner.nextInt();
        System.out.print("Wprowadź dzielnik: ");
        int factor = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            if (i % factor == 0) {
                System.out.println("Liczba: " + i);
            }
        }

    }
}
