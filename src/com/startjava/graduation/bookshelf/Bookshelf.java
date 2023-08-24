package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int numberBooks;
    private int numberShelves;

    public Book[] getBook() {
        return books;
    }

    public int getNumberBooks() {
        return numberBooks;
    }

    public int getNumberShelves() {
        return numberShelves;
    }

    public int freeNumberShelves() {
        return CAPACITY - numberBooks;
    }

    public void saveBooks(Book book) {
        if(numberBooks < CAPACITY) {
            books[numberBooks] = book;
            numberBooks++;
        } else {
            System.out.println("Ошибка: книга не сохранена");
        }
        if(numberShelves < book.getBookInformationLength()) {
            numberShelves = book.getBookInformationLength();
        }
    }

    public Book findBooks(String findNameBook) {
        for(int i = 0; i < numberBooks; i++) {
            if(books[i].getName().equals(findNameBook)) {
                System.out.println("Данная книга найдена " + books[i]);
                return books[i];
            }
        }
        return null;
    }

    public void deleteBooks(String findNameBook) {
        for(int i = 0; i < numberBooks; i++) {
            if(books[i].getName().equals(findNameBook)) {
                int length = books[i].getBookInformationLength();
                System.out.println("Книга удалена " + books[i]);
                numberBooks--;
                System.arraycopy(books, i + 1, books, i, numberBooks - i);
                books[numberBooks] = null;
                if(length == numberShelves) {
                    numberShelves = 0;
                    for(int j = 0; j < numberBooks; j++) {
                        if(numberShelves < books[j].getBookInformationLength()) {
                            numberShelves = books[j].getBookInformationLength();
                        }
                    }
                }
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void clearBookcase() {
        Arrays.fill(books, 0, numberBooks, null);
        numberBooks = 0;
        System.out.println("Шкаф очищен");
    }
}
