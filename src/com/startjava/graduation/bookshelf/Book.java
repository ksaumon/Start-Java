package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String name;
    private int yearsPublishing;
    private String bookInformationLength;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setYearsPublishing(int yearsPublishing) {
        this.yearsPublishing = yearsPublishing;
    }

    public void setBookInformationLength(int bookInformationLength) {
        toString();
    }

    public String getBookInformationLength() {
        return bookInformationLength;
    }

    public String toString(){
        return author + "," + name + "," + yearsPublishing;
    }

}
