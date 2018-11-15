package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class TaxesTest {
    private Taxes taxes = new Taxes();

    @Test
    public void calculateTaxPercentage() {
        assertEquals(taxes.calculateTaxPercentage(100),0,2);
        assertEquals(taxes.calculateTaxPercentage(15000),10,2);
        assertEquals(taxes.calculateTaxPercentage(27000),15,2);
        assertEquals(taxes.calculateTaxPercentage(35000),20,2);
        assertEquals(taxes.calculateTaxPercentage(45001),25,2);
    }

    @Test
    public void howMuchTax() {
        assertEquals(taxes.howMuchTax(45000),11250,2);
        assertEquals(taxes.howMuchTax(5000),0,2);
        assertEquals(taxes.howMuchTax(17500),1750,2);
        assertEquals(taxes.howMuchTax(28000),4200,2);


    }
}