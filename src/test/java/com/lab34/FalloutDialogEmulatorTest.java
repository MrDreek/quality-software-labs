package com.lab34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FalloutDialogEmulatorTest {

    @Test
    void isQuestion() {
        FalloutDialogEmulator fde = new FalloutDialogEmulator();

        assertTrue(fde.isQuestion("Это вопрос?"));
        assertFalse(fde.isQuestion("Это не вопрос"));
    }
}