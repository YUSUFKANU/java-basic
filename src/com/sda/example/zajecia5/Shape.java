package com.sda.example.zajecia5;

/**
 */
public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    protected void printShape() {
        System.out.println("Shape color is: " + this.color +
                ", area = " + this.getArea() + ", perimeter = " + this.getPerimeter());
    }
}
