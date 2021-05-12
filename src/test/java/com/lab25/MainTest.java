package com.lab25;

import org.junit.jupiter.api.Test;

import static com.lab25.Main.reverseString;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testReverseString() {
        assertEquals(reverseString("qwerty"), "ytrewq");
        assertEquals(reverseString("asdfg"), "gfdsa");
        assertEquals(reverseString("asd321dsa"), "asd123dsa");
    }
}