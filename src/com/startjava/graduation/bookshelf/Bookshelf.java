package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private String[] books = new String[CAPACITY];
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
    private int numberBooks;

    public void saveBooks() {
        System.out.println("Введите автора, ");
        book.setAuthor(scanner.nextLine());
        System.out.println("Введите название книги, ");
        book.setName(scanner.nextLine());
        System.out.println("Введите год издания");
        book.setYearsPublishing(scanner.nextInt());
        books[numberBooks] = book.getAuthor() + book.getName() + book.getYearsPublishing();
        deleteBooks();
    }

    public void findBooks() {

    }

    public void deleteBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null){
                System.out.println(books[i]);
            }
        }
    }

    public void getAllBooks() {

    }

    public void getQuantityBooks() {

    }

    public void getFreeShelves() {

    }

    public void clearCloset() {

    }

}
