package com.lab29;

public interface Shape {
    public double getArea();

    public static int compare(Shape s1, Shape s2) {
        if (s1.getArea() > s2.getArea()) {
            return 1;
        }
        return -1;
    }
}
