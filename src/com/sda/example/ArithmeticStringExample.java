package com.sda.example;

/**
 */
public class ArithmeticStringExample {
    public static void main(String[] args) {

        int wynik = 0;
        int liczba = 5;

        for (int i = 1; i <= 459; i++) {
            System.out.print("Liczba = " + liczba);
            wynik += liczba;
            System.out.println(" Bierząca suma = " + wynik);
            liczba += 2;
        }

        System.out.println("Ostateczny wynik = " + wynik);
    }
}
