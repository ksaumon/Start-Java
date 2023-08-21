package com.startjava.graduation.bookshelf;


import java.util.Scanner;

public class Bookshelf {
    public static final int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    Scanner scanner = new Scanner(System.in);
    private int numberBooks;
    private int numberShelves;
    private String name;

    public int getNumberBooks() {
        return numberBooks;
    }

    public int freeNumberShelves() {
        return CAPACITY - numberShelves;
    }

    public void saveBooks(Book book) {
        if (numberBooks > 0) {
            books[numberBooks] = new Book();
        } else {
            books[numberBooks] = book;
        }
        System.out.println("Введите автора");
        scanner.nextLine();
        book.setAuthor(scanner.nextLine());
        System.out.println("Введите название книги");
        book.setName(scanner.nextLine());
        System.out.println("Введите год издания");
        book.setYearsPublishing(scanner.nextInt());
        numberBooks++;
        printBookshelf();
    }

    public void findBooks() {
        System.out.println("Введите название книги");
        String findNameBook = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals(findNameBook)) {
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
            if (books[i].getName().equals(findNameBook)) {
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
