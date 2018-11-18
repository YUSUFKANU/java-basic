package com.sda.example.zajecia5;

/**
 */
public class TestShape {
    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle(10, 15, "red");
//        Circle circle = new Circle(12, "green");
//
//        rectangle.printShape();
//        circle.printShape();

        Shape[] shapes = new Shape[] {
                new Circle(20, "black"),
                new Rectangle(10, 20, "green")
        };

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                ((Circle) shapes[i]).printArea();
            } else {
                ((Rectangle) shapes[i]).printRectangleArea();
            }
        }

    }
}
