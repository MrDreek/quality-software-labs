package com.lab29;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            shapes.add(new Circle(random.nextInt(10 - 5) + 5));
            shapes.add(new Triangle(random.nextInt(10 - 5) + 5));
            shapes.add(new Rectangle(random.nextInt(10 - 5) + 5));
            var test = 123;
        }

        var max = shapes.stream().max(Shape::compare).orElse(null);
        System.out.println(max.toString());
    }
}