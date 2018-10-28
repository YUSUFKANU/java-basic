package com.sda.example;

import java.util.Scanner;

/**
 */
public class PowerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź podstawę potęgi: ");
        int podstawa = scanner.nextInt();
        System.out.print("Wprowadź wykładnik potęgi: ");
        int wykladnik = scanner.nextInt();
        int wynik = 0;

        for (int i = 1; i <= wykladnik; i++) {
            wynik = wynik + i;
        }

        System.out.println("Liczba " + podstawa + " podniesiona do potęgi " + wykladnik + " wynosi: " + wynik);
    }
}
