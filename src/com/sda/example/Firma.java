package com.sda.example;

/**
 */
public class Firma {
    private Pracownik pracownik1;
    private Pracownik pracownik2;

    public Firma(Pracownik pracownik1, Pracownik pracownik2) {
        this.pracownik1 = pracownik1;
        this.pracownik2 = pracownik2;
    }

    public void wyswietlInfo() {
        System.out.println("W naszej firmie pracuje: " + this.pracownik1 + " oraz " + this.pracownik2.wyswietlInfo());
    }

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 50);
        Pracownik pracownik2 = new Pracownik("Krzysztof", "Nowak", 55);
        Firma firma = new Firma(pracownik1, pracownik2);
        firma.wyswietlInfo();
    }
}
