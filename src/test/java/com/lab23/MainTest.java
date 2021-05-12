package com.lab23;

import org.junit.jupiter.api.Test;

import static com.lab23.Main.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testIsPalindrome() {
        assertTrue(isPalindrome("qwertyytrewq"));
        assertFalse(isPalindrome("qwerty"));
        assertTrue(isPalindrome("qqqwqqq"));
    }
}