package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String name;
    private int yearsPublishing;
    private String bookInformationLength;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
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

    public int getYearsPublishing() {
        return yearsPublishing;
    }

    public void setBookInformationLength(int bookInformationLength) {
        line();
    }

    public String getBookInformationLength() {
        return bookInformationLength;
    }

    public String line(){
        return author + name + yearsPublishing;
    }

}
