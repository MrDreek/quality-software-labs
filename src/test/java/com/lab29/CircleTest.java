package com.lab29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle c = new Circle(3);

        assertEquals(c.getArea(), 28.274333882308138);
    }
}