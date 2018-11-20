package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class BasicMathsTest {
    BasicMaths basicMaths = new BasicMaths();

    @Test
    public void addition() {
        assertEquals(basicMaths.addition(6, 4), 10,1);
        assertEquals(basicMaths.addition(-5, 2), -3,1);
        assertEquals(basicMaths.addition(19, 24), 43,1);
        assertEquals(basicMaths.addition(6.1, 4.4), 10.5,1);
        assertEquals(basicMaths.addition(-0.1, -0.1), -0.2,1);
        assertEquals(basicMaths.addition(-6, 4), -2,1);
    }

    @Test
    public void subtraction() {
        assertEquals(basicMaths.subtraction(6, 4), 2,1);
        assertEquals(basicMaths.subtraction(-5, 2), -7,1);
        assertEquals(basicMaths.subtraction(24, 19), 5,1);
        assertEquals(basicMaths.subtraction(6.1, 4.4), 1.7,1);
        assertEquals(basicMaths.subtraction(-0.1, -0.1), 0,1);
        assertEquals(basicMaths.subtraction(-6, 4), -10,1);
    }

    @Test
    public void multiply() {
        assertEquals(basicMaths.multiply(6, 4), 24,1);
        assertEquals(basicMaths.multiply(-5, 2), -10,1);
        assertEquals(basicMaths.multiply(24, 19), 456,1);
        assertEquals(basicMaths.multiply(6.1, 4.4), 26.84,2);
        assertEquals(basicMaths.multiply(-0.1, -0.1), 0.01,2);
        assertEquals(basicMaths.multiply(-6, 4), -24,1);
    }

    @Test
    public void divide() {
        assertEquals(basicMaths.divide(6, 4), 1.5,1);
        assertEquals(basicMaths.divide(-4, 2), -2,1);
        assertEquals(basicMaths.divide(24, 2), 12,1);
        assertEquals(basicMaths.divide(6.9, 2.3), 3,1);
        assertEquals(basicMaths.divide(-0.1, -0.1), 1,1);
        assertEquals(basicMaths.divide(-6, 4), -1.5,1);
    }


    @Test
    public void power() {
        assertEquals(basicMaths.power(2, 4), 16,1);
        assertEquals(basicMaths.power(2, -2), 0.25,1);
        assertEquals(basicMaths.power(5, 3), 125,1);
        assertEquals(basicMaths.power(9, 0.5), 3,1);
    }

    @Test
    public void squareRoot() {
        assertEquals(basicMaths.squareRoot(4), 2,1);
        assertEquals(basicMaths.squareRoot(9), 3,1);
        assertEquals(basicMaths.squareRoot(16), 4,1);
        assertEquals(basicMaths.squareRoot(100), 10,1);
        assertEquals(basicMaths.squareRoot(361), 19,1);
    }
}