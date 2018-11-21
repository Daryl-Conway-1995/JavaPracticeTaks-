package com.qa.Library;

public class Book extends ReadingMaterialBase {
    public Book(String name, String publisher, int pages, String date){
        setName(name);
        setNumberOfPages(pages);
        setPublisher(publisher);
        setPublishedDate(date);
    }
}
