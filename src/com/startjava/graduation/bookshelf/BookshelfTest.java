package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class BookshelfTest {

    private static final int quit = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        do {
            printBookshelf(bookshelf);
            menu();
        }while(chooseMenuItem(scanner, bookshelf) != quit);
    }

    public static void menu() {
        System.out.println("""
          1. save book
          2. find book
          3. delete book
          4. clear bookshelf
          5. quit
          """);
    }

    public static void printBookshelf(Bookshelf bookshelf) {
        if (bookshelf.getNumberBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            Book[] books = Arrays.copyOf(bookshelf.getBook(), bookshelf.getNumberBooks());
            System.out.println("В шкафу книг -" + bookshelf.getNumberBooks() +
                    ", Свободных полок -" + bookshelf.freeNumberShelves());
            for(Book book: books) {
                System.out.println("|" + book + " ".repeat( bookshelf.getNumberShelves()
                    - book.getBookInformationLength()) + "|");
                System.out.println("|" + "-".repeat(bookshelf.getNumberShelves()) + "|");
                }
            System.out.println("|" + " ".repeat(bookshelf.getNumberShelves()) + "|\n");
        }
    }

    public static int chooseMenuItem(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите номер команды");
        int itemMenu = scanner.nextInt();
        if(itemMenu == 1) {
            saveBooks(scanner, bookshelf);
        }
        if(itemMenu == 2) {
            findBooks(scanner, bookshelf);
        }
        if(itemMenu == 3) {
            deleteBooks(scanner, bookshelf);
        }
        if(itemMenu == 4) {
            bookshelf.clearBookcase();
        }
        if(itemMenu == 5) {
            return quit;
        }
        pressEnter(scanner);
        return itemMenu;
    }

    public static void saveBooks(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите автора");
        scanner.nextLine();
        String author = scanner.nextLine();
        System.out.println("Введите название книги");
        String name = scanner.nextLine();
        System.out.println("Введите год издания");
        int yearsPublishing = scanner.nextInt();
        Book book = new Book(author, name, yearsPublishing);
        bookshelf.saveBooks(book);
    }

    public static void findBooks(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите название книги");
        scanner.nextLine();
        String findNameBook = scanner.nextLine();
        Book book = bookshelf.findBooks(findNameBook);
        if (book == null) {
            System.out.println("Данная книга не найдена");
        }
    }

    public static void deleteBooks(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите название книги");
        scanner.nextLine();
        String findNameBook = scanner.nextLine();
        bookshelf.deleteBooks(findNameBook);
    }

    public static void pressEnter(Scanner scanner) {
        System.out.println("Для продолжение работы нажмите клавишу Enter");
        String choice;
        do {
            scanner.nextLine();
            choice = scanner.nextLine();
        } while(!choice.equals(""));
    }
}
