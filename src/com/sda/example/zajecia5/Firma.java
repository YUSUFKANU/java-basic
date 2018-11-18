package com.sda.example.zajecia5;

/**
 */
public class Firma {
    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 30);
        pracownik1.wyswietlDane();

        Pracownik pracownik2 = new Pracownik("Marek", "Nowak");
        pracownik2.wyswietlDane();

        Pracownik pracownik3 = new Pracownik();
        pracownik3.wyswietlDane();
    }
}
