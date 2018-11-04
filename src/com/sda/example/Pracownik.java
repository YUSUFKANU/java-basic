package com.sda.example;

/**
 */
public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String wyswietlInfo() {
        String pracownikInfo = "["+ imie + " "
                + nazwisko + ", "
                + wiek + " lat]";
        return pracownikInfo;
    }
}
