package com.sda.example;

/**
 */
public class LogicalOperations {
    public static void main(String[] args) {
        boolean wynik;

        wynik = 3 == 3 && 3 == 4;
        System.out.println("3 == 3 && 3 == 4 = " + wynik);

        wynik = 3 != 5 || 3 == 5;
        System.out.println("3 != 5 || 3 == 5 = " + wynik);

        wynik = (2+4) > (1+3);
        System.out.println("(2+4) > (1+3) = " + wynik);

        wynik = "cos".equals("cos");            ;
        System.out.println("\"cos\".equals(\"cos\") = " + wynik);

        wynik = "cos" == "cos";            ;
        System.out.println("\"cos\" == \"cos\" = " + wynik);
    }
}
