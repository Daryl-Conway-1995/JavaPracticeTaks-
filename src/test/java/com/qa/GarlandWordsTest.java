package com.qa;

import org.junit.Test;

import static org.junit.Assert.*;

public class GarlandWordsTest {

    private GarlandWords garlandWords = new GarlandWords();

    @Test
    public void notAGarlandWord() {assertEquals(garlandWords.isThisAGarlandWord(
            "simple"),"simple");}


    @Test
    public void shortGarlandWord() {assertEquals(garlandWords.isThisAGarlandWord(
            "comic"),"comicomicomicomicomicomicomicomicomic");}


    @Test
    public void GarlandWord() {assertEquals(garlandWords.isThisAGarlandWord(
            "onion"),"onionionionionionionionionion");}


    @Test
    public void LongGarlandWord() {assertEquals(garlandWords.isThisAGarlandWord(
            "oneTone"),"oneToneToneToneToneToneToneToneToneTone");}

    @Test
    public void checkForFullWord() {assertEquals(garlandWords.isThisAGarlandWord(
            "pup"),"pupupupupupupupupup");}

}