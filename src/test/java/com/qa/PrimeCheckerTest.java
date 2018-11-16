package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeCheckerTest {
    private PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void isThisPrime() {
        assertTrue(primeChecker.isThisPrime(7));
        assertTrue(primeChecker.isThisPrime(53));
        assertTrue(primeChecker.isThisPrime(97));
        assertFalse(primeChecker.isThisPrime(8));
        assertTrue(primeChecker.isThisPrime(2));
        assertFalse(primeChecker.isThisPrime(1));
        assertFalse(primeChecker.isThisPrime(-7));


    }

    @Test
    public void findPrimesBetween() {
        assertEquals(primeChecker.findPrimesBetween(1,7),"2,3,5,7,");
        assertEquals(primeChecker.findPrimesBetween(7,43),"7,11,13,17,19,23,29,31,37,41,43,");
        assertEquals(primeChecker.findPrimesBetween(-4,9),"2,3,5,7,");
        assertEquals(primeChecker.findPrimesBetween(-50,-45),"");
        assertEquals(primeChecker.findPrimesBetween(1110,1150),"1117,1123,1129,");

    }
}