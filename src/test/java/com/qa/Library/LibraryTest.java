package com.qa.Library;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    Library library = new Library();

    @Test
    public void StorageTest() {
        assertEquals(library.findBook("not a book"), "book not found.");
        assertEquals(library.findBook("generic book"), "generic book, generic publisher, 04/01/94, 100 pages.");
        assertEquals(library.findBook("abc"), "abc, cba, 05/07/56, 34 pages.");
    }

    @Test
    public void allStorageTest() {
        assertEquals(library.showAllBooks(), "\n" +
                "generic book, generic publisher, 04/01/94, 100 pages.\n" +
                "anouther book, second publisher, 01/01/87, 5 pages.\n" +
                "abc, cba, 05/07/56, 34 pages.");
        library.findBook("generic book");
        assertEquals(library.showAllBooks(), "\n" +
                "anouther book, second publisher, 01/01/87, 5 pages.\n" +
                "abc, cba, 05/07/56, 34 pages.");
        library.returnBook("generic book");
        assertEquals(library.showAllBooks(), "\n" +
                "generic book, generic publisher, 04/01/94, 100 pages.\n" +
                "anouther book, second publisher, 01/01/87, 5 pages.\n" +
                "abc, cba, 05/07/56, 34 pages.");

    }
}