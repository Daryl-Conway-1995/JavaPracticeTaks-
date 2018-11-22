package com.qa.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<ReadingMaterialBase> storage = new ArrayList();
    private Book firstBook = new Book("generic book", "generic publisher", 100, "04/01/94");
    private Book secondBook = new Book("anouther book", "second publisher", 5, "01/01/87");
    private NewsPaper newsPaper = new NewsPaper("abc", "cba", 34, "05/07/56");

    public Library(){
        storage.add(firstBook);
        storage.add(secondBook);
        storage.add(newsPaper);
    }

    public String findBook(String bookName){
        for(ReadingMaterialBase read : storage){
            if (read.getName() == bookName){
                read.rentBook();
                return read.toString();
            }
        }
        return "book not found.";
    }

    public String returnBook(String bookName){
        for(ReadingMaterialBase read : storage){
            if (read.getName() == bookName){
                read.returnBook();
                return read.toString();
            }
        }
        return "book not found.";
    }

    public String showAllBooks(){
        String allBooks = "";
        for(ReadingMaterialBase read : storage){
            if (read.isThisInLibrary()) {
                allBooks = allBooks + "\n" + read.toString();
            }
        }
        return allBooks;
    }

}
