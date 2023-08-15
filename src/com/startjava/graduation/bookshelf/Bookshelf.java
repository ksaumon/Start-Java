package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private String[] books = new String[CAPACITY];
    Scanner scanner = new Scanner(System.in);
    Book book = new Book();
    private int numberBooks;
    private int numberShelves;

    public int getNumberBooks() {
        return numberBooks;
    }

    public int freeNumberShelves() {
        return CAPACITY - numberShelves;
    }

    public void book() {

    }

    public void saveBooks() {
        System.out.println("Введите автора");
        book.setAuthor(scanner.nextLine());
        System.out.println("Введите название книги");
        book.setName(scanner.nextLine());
        System.out.println("Введите год издания");
        book.setYearsPublishing(scanner.nextInt());
        books[numberBooks] = book.line();
        numberBooks++;
        printBookshelf();
    }

    public void findBooks() {
        System.out.println("Введите название книги");
        scanner.nextLine();
        String findNameBook = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i] == findNameBook) {
                System.out.println("Данная книга найдена" + books[numberBooks]);
                break;
            }
        }
        System.out.println("Данная книга не найдена");
    }

    public void deleteBooks() {
        System.out.println("Введите название книги");
        scanner.nextLine();
        String findNameBook = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].bgetName == findNameBook) {
                books[i] = null;
            } else {
                System.out.println("Книга не найдена");
            }
        }

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
