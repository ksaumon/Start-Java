package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int yearsPublishing;
    private int length;

    public Book(String author, String title, int yearsPublishing) {
        this.author = author;
        this.title = title;
        this.yearsPublishing = yearsPublishing;
        length = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return author + ", " + title + ", " + yearsPublishing;
    }
}
