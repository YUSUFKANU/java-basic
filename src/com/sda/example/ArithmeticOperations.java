package com.sda.example;

/**
 */
public class ArithmeticOperations {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        double wynik;

        wynik = (a + b) * c;

        System.out.println("a + b) * c = " + wynik);

        wynik = (a * b) % c;

        System.out.println("(a * b) % c = " + wynik);

        wynik = (b + c) * a++;
        wynik /= 5;

        a = a + 1;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
        a = a - 1;
        System.out.println("a = " + a);
        a--;
        System.out.println("a = " + a);


        float aa = 1.1f;
        long bb = 1L;
        float cc = aa + bb;




    }
}
