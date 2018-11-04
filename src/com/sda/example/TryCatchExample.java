package com.sda.example;

/**
 */
public class TryCatchExample {

    public static void main(String[] args) {
        Double wynik = divide(123432,0);
        if (wynik != null) {
            System.out.println("Wynik dzielenia wynosi: " + wynik);
        }
    }

    static Double divide(int a, int b) {
        Double x;

        try {
            x =((double) a)/((double) b);
        } catch (ArithmeticException ex) {
            System.out.println("Dzielenie przez zero!");

            return null;
        }

        return x;
    }
}
