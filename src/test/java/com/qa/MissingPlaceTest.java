package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class MissingPlaceTest {

    private MissingPlace missingPlace = new MissingPlace();

    @Test
    public void missingFirstPlace() {
        assertEquals(missingPlace.missThisPlace(1),
                "2nd,3rd,4th,5th,6th,7th,8th,9th,10th,11th,12th,13th,14th,15th,16th,17th,18th,19th,20th,");}


    @Test
    public void missingSecondPlace() {
        assertEquals(missingPlace.missThisPlace(2),
                "1st,3rd,4th,5th,6th,7th,8th,9th,10th,11th,12th,13th,14th,15th,16th,17th,18th,19th,20th,");}


    @Test
    public void missingFifthPlace() {
        assertEquals(missingPlace.missThisPlace(5),
                "1st,2nd,3rd,4th,6th,7th,8th,9th,10th,11th,12th,13th,14th,15th,16th,17th,18th,19th,20th,");}


    @Test
    public void missingOutOfBounds() {
        assertEquals(missingPlace.missThisPlace(22),
                "1st,2nd,3rd,4th,5th,6th,7th,8th,9th,10th,11th,12th,13th,14th,15th,16th,17th,18th,19th,20th,");}

}