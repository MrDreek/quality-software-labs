package com.lab29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void getArea() {
        Triangle tr = new Triangle(2);
        assertEquals(tr.getArea(), 2);
    }
}