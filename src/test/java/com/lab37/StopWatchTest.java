package com.lab37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StopWatchTest {

    @Test
    void testStart() {
        StopWatch sw = new StopWatch();
        sw.start();
        assertNotEquals(sw.getStartTime(), 0);
        assertTrue(sw.isRunning());
    }

    @Test
    void testStop() {
        StopWatch sw = new StopWatch();
        sw.start();
        sw.stop();
        assertNotEquals(sw.getStopTime(), 0);
        assertFalse(sw.isRunning());
    }

    @Test
    void testGetElapsedTime() {
        /// ???
    }

    @Test
    void testGetElapsedTimeSecs() {
        /// ???
    }
}