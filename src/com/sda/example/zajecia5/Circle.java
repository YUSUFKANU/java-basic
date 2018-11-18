package com.sda.example.zajecia5;

import static java.lang.Math.pow;
import static java.lang.Math.PI;

/**
 */
public class Circle extends Shape {
    private int r;

    public Circle(int r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI * pow(this.r, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * this.r;
    }

    public void printArea() {
        System.out.println("Area of circle: " + getArea());
    }
}
