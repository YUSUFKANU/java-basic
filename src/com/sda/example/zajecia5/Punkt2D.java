package com.sda.example.zajecia5;

/**
 */
public class Punkt2D {
    protected int x;
    protected int y;

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Współrzędne: (" + this.x + ", " + this.y + ")";
    }
}
