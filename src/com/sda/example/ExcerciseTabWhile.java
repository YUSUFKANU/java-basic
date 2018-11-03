package com.sda.example;

import java.util.Scanner;

/**
 */
public class ExcerciseTabWhile {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj rozmiar tablicy: ");
        final int n = scanner.nextInt();
        int i = 0;
        int[] tab = new int[n];
        while (i < n) {
            tab[i] = i + 1;
            ++i;
        }

        int j = 0;
        while (j < n) {
            System.out.println("tab[" + j + "]=" + tab[j]);
            j++;
        }

    }
}
