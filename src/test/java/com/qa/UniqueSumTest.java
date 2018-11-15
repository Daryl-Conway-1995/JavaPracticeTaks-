package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueSumTest {
    private UniqueSum uniqueSum = new UniqueSum();

    @Test
    public void testUnique(){
        assertEquals(uniqueSum.calculateSum(1,2,3),6);
        assertEquals(uniqueSum.calculateSum(5,1,8),14);
        assertEquals(uniqueSum.calculateSum(9,4,2),15);
        assertEquals(uniqueSum.calculateSum(1,0,-2),-1);
    }

    @Test
    public void testNoneUnique(){
        assertEquals(uniqueSum.calculateSum(1,1,3),3);
        assertEquals(uniqueSum.calculateSum(5,1,5),1);
        assertEquals(uniqueSum.calculateSum(9,2,2),9);
        assertEquals(uniqueSum.calculateSum(4,4,4),0);
    }
}