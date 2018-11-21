package com.qa.Library;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {
    Library library = new Library();

    @Test
    public void StorageTest(){
        assertEquals(library.findBook("not a book"),"book not found.");
        assertEquals(library.findBook("generic book"),"generic book, generic publisher, 04/01/94, 100 pages.");
        assertEquals(library.findBook("abc"),"abc, cba, 05/07/56, 34 pages.");
    }

}