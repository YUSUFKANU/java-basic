package com.sda.example.zajecia5;

/**
 */
public class Pracownik {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Pracownik() {
        this("Pan", "X", 40);
    }

    public Pracownik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = 25;
    }

    public Pracownik(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public void wyswietlDane() {
        System.out.println("Imię: " + this.imie + ", nazwisko: " +
                this.nazwisko + ", wiek: " + this.wiek);
    }
}
