package com.lab37.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {

    @Test
    void calcCalories() {
        Workout w = new Workout("Test", 200.0);

        var result = Math.round(w.calcCalories(123.0) * 100.0) / 100.0;
        var expect = 6.83;

        assertEquals(result, expect);
    }
}