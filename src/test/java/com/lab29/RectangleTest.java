package com.lab29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        Rectangle rec = new Rectangle(3);

        assertEquals(rec.getArea(), 9);
    }
}