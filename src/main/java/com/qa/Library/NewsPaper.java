package com.qa.Library;

public class NewsPaper extends ReadingMaterialBase {
    public NewsPaper(String name, String publisher, int pages, String date){
        setName(name);
        setNumberOfPages(pages);
        setPublisher(publisher);
        setPublishedDate(date);
    }
}
