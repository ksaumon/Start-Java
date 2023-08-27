package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int capacity = 10;
    private Book[] books = new Book[capacity];
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
        return capacity - numberBooks;
    }

    public void save(Book book) {
        if(numberBooks < capacity) {
            books[numberBooks] = book;
            numberBooks++;
            findMaxLength(maxLength);
        } else {
            System.out.println("Ошибка: книга не сохранена");
        }
    }

    public Book find(String findTitle) {
        for(int i = 0; i < numberBooks; i++) {
            if(books[i].getTitle().equals(findTitle)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String findTitle) {
        for(int i = 0; i < numberBooks; i++) {
            if(books[i].getTitle().equals(findTitle)) {
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
        if(length == maxLength) {
            maxLength = 0;
            for(int j = 0; j < numberBooks; j++) {
                if(maxLength < books[j].getLength()) {
                    maxLength = books[j].getLength();
                    capacity = maxLength;
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
