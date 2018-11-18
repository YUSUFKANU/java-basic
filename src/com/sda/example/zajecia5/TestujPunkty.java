package com.sda.example.zajecia5;

/**
 */
public class TestujPunkty {
    public static void main(String[] args) {
        final Punkt2D punkt2D = new Punkt2D();
        System.out.println(punkt2D.toString());

        final Punkt2D punkt2D1 = new Punkt2D(25, 10);
        System.out.println(punkt2D1.toString());

        final Punkt3D punkt3D = new Punkt3D();
        System.out.println(punkt3D.toString());

        final Punkt3D punkt3D1 = new Punkt3D(25, 10, 89);
        System.out.println(punkt3D1.toString());
    }
}
