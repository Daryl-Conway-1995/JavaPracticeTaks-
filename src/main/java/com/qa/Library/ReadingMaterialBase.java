package com.qa.Library;

abstract public class ReadingMaterialBase {
    private int numberOfPages = 1;
    private String publisher = "";
    private String name= "";
    private String publishedDate = "";


    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getName() {
        return name;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return name + ", " + publisher + ", " + publishedDate + ", " + numberOfPages + " pages.";
    }
}
