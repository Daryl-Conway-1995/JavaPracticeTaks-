package com.qa;

import static org.junit.Assert.*;
import org.junit.Test;

public class FactorialTest {

    private Factorial factorial = new Factorial();

    @Test
    public void shouldBeTrue() {assertTrue(factorial.isThisFactorial(720));}

}
