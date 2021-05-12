package com.lab29;

public class Triangle implements Shape {
    private final double side;

    public Triangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        // допустим это прямоугольный треугольник
        return 0.5 * side * side;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                " area=" + getArea() +
                '}';
    }
}
