package com.lab29;

public class Rectangle implements Shape {
    private final double side;

    public Rectangle(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "side=" + side +
                " area=" + getArea() +
                '}';
    }
}
