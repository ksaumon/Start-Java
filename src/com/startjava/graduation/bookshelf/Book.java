package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String name;
    private int yearsPublishing;
    private int bookInformationLength;

    public Book(String author, String name, int yearsPublishing) {
        this.author = author;
        this.name = name;
        this.yearsPublishing = yearsPublishing;
        bookInformationLength = toString().length();
    }

    public String getName() {
        return name;
    }

    public int getBookInformationLength() {
        return bookInformationLength;
    }

    public String toString(){
        return author + ", " + name + ", " + yearsPublishing;
    }

}
