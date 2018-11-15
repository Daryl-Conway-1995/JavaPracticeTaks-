package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class IsSummerTest {
    private IsSummer isSummer = new IsSummer();

    @Test
    public void isInTemp() {
        assertEquals(isSummer.isInTemp(95,true),true);
        assertEquals(isSummer.isInTemp(85,true),true);
        assertEquals(isSummer.isInTemp(85,false),true);
    }

    @Test
    public void isNotInTemp() {
        assertEquals(isSummer.isInTemp(95,false),false);
        assertEquals(isSummer.isInTemp(35,false),false);
        assertEquals(isSummer.isInTemp(105,true),false);
    }
}