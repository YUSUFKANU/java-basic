package com.sda.example.zajecia5;

/**
 */
public class Punkt3D extends Punkt2D {
    private int z;

    public Punkt3D() {
        super();
        this.z = 0;
    }

    public Punkt3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Współrzedne: (" + this.x + ", " + this.y + ", " + this.z + ")";
    }
}
