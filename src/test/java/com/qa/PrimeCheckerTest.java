package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeCheckerTest {
    private PrimeChecker primeChecker = new PrimeChecker();

    @Test
    public void isThisPrime() {
        assertEquals(primeChecker.isThisPrime(7),true);
        assertEquals(primeChecker.isThisPrime(53),true);
        assertEquals(primeChecker.isThisPrime(97),true);
        assertEquals(primeChecker.isThisPrime(8),false);
        assertEquals(primeChecker.isThisPrime(2),true);
        assertEquals(primeChecker.isThisPrime(1),false);
        assertEquals(primeChecker.isThisPrime(-7),false);


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