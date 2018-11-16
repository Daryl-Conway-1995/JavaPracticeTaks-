package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaintWizardTest {
    private PaintWizard paintWizard = new PaintWizard();

    @Test
    public void findBestPaint() {
        assertEquals(paintWizard.findBestPaint(100),"AverageJoes at 179.9 for 10 cans with waste amount of 10");
        assertEquals(paintWizard.findBestPaint(20),"AverageJoes at 35.98 for 2 cans with waste amount of 2");
        assertEquals(paintWizard.findBestPaint(55),"AverageJoes at 89.95 for 5 cans with waste amount of 11");

    }
}