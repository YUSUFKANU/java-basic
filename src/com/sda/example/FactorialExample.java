package com.sda.example;

import java.util.Scanner;

/**
 */
public class FactorialExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n >= 0) {
            int i = 1;
            double factorial = 1;

            while (i <= n) {
                factorial *= i;
                ++i;
            }
            System.out.println("Wartość " + n + "! = " + factorial);
        } else {
            System.out.println("Podaj wartość nieujemną!");
        }

    }
}
