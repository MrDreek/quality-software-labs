package com.lab29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getArea() {
        Circle c = new Circle(3);

        var result = Math.round(c.getArea() * 100.0) / 100.0;
        var expect = 28.27;

        assertEquals(result, expect);
    }
}