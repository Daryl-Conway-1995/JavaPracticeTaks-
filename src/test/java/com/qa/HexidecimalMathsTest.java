package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class HexidecimalMathsTest {
    private HexidecimalMaths hexidecimalMaths = new HexidecimalMaths();

    @Test
    public void addition() {
        assertEquals(hexidecimalMaths.addition("a", "a"), "14");
        assertEquals(hexidecimalMaths.addition("ae", "a"), "b8");
        assertEquals(hexidecimalMaths.addition("eee", "1"), "eef");
        assertEquals(hexidecimalMaths.addition("ed45", "1d3"), "ef18");
    }

    @Test
    public void subtraction() {
        assertEquals(hexidecimalMaths.subtraction("a", "a"), "0");
        assertEquals(hexidecimalMaths.subtraction("ae", "a"), "a4");
        assertEquals(hexidecimalMaths.subtraction("eee", "1"), "eed");
        assertEquals(hexidecimalMaths.subtraction("ed45", "1d3"), "eb72");
    }

    @Test
    public void multiply() {
        assertEquals(hexidecimalMaths.multiply("a", "a"), "64");
        assertEquals(hexidecimalMaths.multiply("ab", "ba"), "7c3e");
        assertEquals(hexidecimalMaths.multiply("5", "a"), "32");
        assertEquals(hexidecimalMaths.multiply("f", "4"), "3c");

    }
}