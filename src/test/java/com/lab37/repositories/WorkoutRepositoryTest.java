package com.lab37.repositories;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkoutRepositoryTest {

    @Test
    void find() throws Exception {
        WorkoutRepository wr = new WorkoutRepository();

        assertNotEquals(wr.find("Отжимания"), null);

        assertThrows(Exception.class, () -> {
            wr.find("123");
        });
    }
}