package com.lab37.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutTest {

    @Test
    void calcCalories() {
        Workout w = new Workout("Test", 200.0);

        assertEquals(w.calcCalories(123.0), 6.833333333333333);
    }
}