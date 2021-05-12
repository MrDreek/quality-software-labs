package com.lab37.models;

import static org.junit.jupiter.api.Assertions.*;

class ProfileTest {

    @org.junit.jupiter.api.Test
    void increaseSum() {
        Profile pf = new Profile("Test");

        assertEquals(pf.getColories(), 0.0);

        pf.increaseSum(10.0);

        assertEquals(pf.getColories(), 10.0);
    }
}