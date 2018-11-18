package com.sda.example.zajecia5;

/**
 */
public class Czas {
    private static final int LICZBA_MINUT_W_GODZINIE = 60;
    private int godziny;
    private int minuty;

    public Czas(int godziny, int minuty) {
        this.godziny = godziny;
        this.minuty = minuty;
    }

    @Override
    public String toString() {
        return this.godziny + "h " + this.minuty + "min";
    }

    private int obliczSumeMinut(Czas t) {
        return t.godziny * LICZBA_MINUT_W_GODZINIE + t.minuty;
    }

    private Czas obliczCzas(int sumaMinut) {
        return new Czas(sumaMinut/LICZBA_MINUT_W_GODZINIE,
                sumaMinut % LICZBA_MINUT_W_GODZINIE);
    }

    public Czas dodaj(Czas t) {
        final int sumaMinut = obliczSumeMinut(this);
        final int sumaMinutCzasuDodawanego = obliczSumeMinut(t);
        final int suma = sumaMinut + sumaMinutCzasuDodawanego;

        return obliczCzas(suma);
    }

    public Czas odejmij(Czas t) {
        final int sumaMinut = obliczSumeMinut(this);
        final int sumaMinutCzasuOdejmowanego = obliczSumeMinut(t);
        final int roznica = sumaMinut >= sumaMinutCzasuOdejmowanego ?
                sumaMinut - sumaMinutCzasuOdejmowanego : 0;

        return obliczCzas(roznica);
    }

    public Czas pomnoz(int mnozna) {
        final int sumaMinut = obliczSumeMinut(this);
        final int iloczynCzasuWMinutach = sumaMinut * mnozna;

        return obliczCzas(iloczynCzasuWMinutach);
    }

    public static void main(String[] args) {
        Czas t1 = new Czas(5, 35);
        Czas t2 = new Czas(3, 45);
        Czas wynikSuma = t1.dodaj(t2);

        System.out.println("Suma czasów wynosi: " + wynikSuma);

        Czas wynikRoznica = t2.odejmij(t1);
        System.out.println("Różnica czasów wynosi: " + wynikRoznica);

        Czas wynikIloczyn = t1.pomnoz(2);
        System.out.println("Iloczyn czasu wynosi: " + wynikIloczyn);

    }

}
