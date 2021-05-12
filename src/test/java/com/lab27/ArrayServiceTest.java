package com.lab27;

import org.junit.jupiter.api.Test;

import static com.lab27.ArrayService.findAverage;
import static com.lab27.ArrayService.flatten;
import static org.junit.jupiter.api.Assertions.*;

class ArrayServiceTest {

    @Test
    void testFlatten() {
        Integer[][] arr = new Integer[10][10];

        var test = flatten(arr).toArray();
        assertEquals(test.length, 100);
    }

    @Test
    void testFindAverageUsingStream() {
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }

        assertEquals(findAverage(arr), 2.0);
    }
}