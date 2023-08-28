package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private static final int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int numberBooks;
    private int maxLength;

    public Book[] getBooks() {
        return Arrays.copyOf(books, numberBooks);
    }

    public int getNumberBooks() {
        return numberBooks;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getCountFreeShelves() {
        return CAPACITY - numberBooks;
    }

    public void save(Book book) {
        if (numberBooks < CAPACITY) {
            books[numberBooks] = book;
            numberBooks++;
            findMaxLength(maxLength);
        } else {
            System.out.println("Ошибка: книга не сохранена");
        }
    }

    public Book find(String title) {
        for (int i = 0; i < numberBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < numberBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                int length = books[i].getLength();
                System.out.println("Книга удалена ");
                numberBooks--;
                System.arraycopy(books, i + 1, books, i, numberBooks - i);
                books[numberBooks] = null;
                findMaxLength(length);
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    public void findMaxLength(int length) {
        if (length == maxLength) {
            maxLength = 0;
            for (int i = 0; i < numberBooks; i++) {
                if (maxLength < books[i].getLength()) {
                    maxLength = books[i].getLength();
                }
            }
        }
    }

    public void clearBookcase() {
        Arrays.fill(books, 0, numberBooks, null);
        numberBooks = 0;
        System.out.println("Шкаф очищен");
    }
}
