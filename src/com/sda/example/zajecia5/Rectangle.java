package com.sda.example.zajecia5;

/**
 */
public class Rectangle extends Shape {
    private int x;
    private int y;

    public Rectangle(int x, int y, String color) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public double getArea() {
        return this.x * this.y;
    }

    @Override
    public double getPerimeter() {
        return 2* this.x + 2 * this.y;
    }

    public void printRectangleArea() {
        System.out.println("Area of rectangle: " + getArea());
    }
}
