package com.qa;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void factorialOfSix() {assertTrue(factorial.isThisFactorial(720));}

    @Test
    public void factorialOfTen() {assertTrue(factorial.isThisFactorial(3628800));}

    @Test
    public void factorialOfTwo() {assertTrue(factorial.isThisFactorial(2));}

    @Test
    public void notAFactorialEight() {assertFalse(factorial.isThisFactorial(8));}

    @Test
    public void negativeInput() {assertFalse(factorial.isThisFactorial(-8));}

}
