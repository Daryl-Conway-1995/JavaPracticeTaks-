package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryMathsTest {
    private BinaryMaths binaryMaths = new BinaryMaths();

    @Test
    public void addition() {
        assertEquals(binaryMaths.addition(101, 1010), 15);
        assertEquals(binaryMaths.addition(11, 11), 6);
        assertEquals(binaryMaths.addition(101110, 100101), 83);
        assertEquals(binaryMaths.addition(111111, 1), 64);
    }

    @Test
    public void subtraction() {
        assertEquals(binaryMaths.subtraction(101, 1010), -5);
        assertEquals(binaryMaths.subtraction(11, 11), 0);
        assertEquals(binaryMaths.subtraction(101110, 100101), 9);
        assertEquals(binaryMaths.subtraction(111111, 1), 62);
    }

    @Test
    public void multiply() {
        assertEquals(binaryMaths.multiply(101, 1010), 50);
        assertEquals(binaryMaths.multiply(11, 11), 9);
        assertEquals(binaryMaths.multiply(101110, 100101), 1702);
        assertEquals(binaryMaths.multiply(111111, 1), 63);
    }

    @Test
    public void additionBaseX() {
        assertEquals(binaryMaths.additionBaseX(101, 1010, 2), 15);
        assertEquals(binaryMaths.additionBaseX(101, 1010, 3), 40);
        assertEquals(binaryMaths.additionBaseX(101, 1010, 4), 85);
        assertEquals(binaryMaths.additionBaseX(101, 1010, 5), 156);
    }

    @Test
    public void convertToBinary() {
        assertEquals(binaryMaths.convertToBinary(7), 111);
        assertEquals(binaryMaths.convertToBinary(52), 110100);
        assertEquals(binaryMaths.convertToBinary(101), 1100101);
        assertEquals(binaryMaths.convertToBinary(819), 1100110011);
        assertEquals(binaryMaths.convertToBinary(127), 1111111);
    }
}