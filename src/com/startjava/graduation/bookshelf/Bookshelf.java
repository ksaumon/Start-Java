package com.startjava.graduation.bookshelf;


import java.util.Scanner;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    Scanner scanner = new Scanner(System.in);
    private int numberBooks;
    private int numberShelves;

    public int getNumberBooks() {
        return numberBooks;
    }

    public int freeNumberShelves() {
        return CAPACITY - numberShelves;
    }

    public void saveBooks(Book book) {
        books[numberBooks] = book;
        numberBooks++;
        printBookshelf();
    }

    public Book findBooks(String findNameBook) {
        for (int i = 0; i < numberBooks; i++) {
            if (books[i].getName().equals(findNameBook)) {
                System.out.println("Данная книга найдена " + books[i]);
                return books[i];
            }
        }
        return null;
    }

    public void deleteBooks(String findNameBook) {
        for (int i = 0; i < numberBooks; i++) {
            if (books[i].getName().equals(findNameBook)) {
                System.out.println("Книга удалена " + books[i]);
                numberBooks--;
                System.arraycopy(books, i + 1, books, i, numberBooks - i);
                books[i] = null;
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void printBookshelf() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println(books[i] + "");
            }
        }
    }

    public void clearBookshelf() {

    }

    public void getQuantityBooks() {

    }

    public void getFreeShelves() {

    }

    public void clearCloset() {

    }

}
