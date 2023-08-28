package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final int QUIT = 5;
    static Scanner scanner = new Scanner(System.in);
    static Bookshelf bookshelf = new Bookshelf();

    public static void main(String[] args) {
        do {
            printBookshelf();
            printMenu();
        } while(chooseMenuItem() != QUIT);
    }

    private static void printBookshelf() {
        if(bookshelf.getNumberBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            Book[] books = bookshelf.getBooks();
            int maxLength = bookshelf.getMaxLength();
            System.out.println("В шкафу книг - " + bookshelf.getNumberBooks() +
                    ", Свободных полок - " + bookshelf.getCountFreeShelves());
            for(Book book : books) {
                System.out.println("|" + book + " ".repeat(maxLength - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
            }
            System.out.println("|" + " ".repeat(maxLength) + "|\n");
        }
    }

    private static void printMenu() {
        System.out.println("""
                1. save book
                2. find book
                3. delete book
                4. clear bookshelf
                5. quit
                """);
    }

    private static int chooseMenuItem() {
        System.out.println("Введите номер команды");
        String menuItem = scanner.nextLine();
        switch (menuItem) {
            case "1" -> saveBook();
            case "2" -> findBook();
            case "3" -> deleteBook();
            case "4" -> bookshelf.clearBookcase();
            case "5" -> {return QUIT;}
            default -> System.out.println("Такого номера нет. Введите номер из списка. ");
        }
        pressEnter();
        return 0;
    }

    private static void saveBook() {
        System.out.println("Введите автора");
        String author = scanner.nextLine();
        String title = inputTitle();
        System.out.println("Введите год издания");
        int yearsPublishing = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(author, title, yearsPublishing);
        bookshelf.save(book);
    }

    private static void findBook() {
        String title = inputTitle();
        Book book = bookshelf.find(title);
        if(book == null) {
            System.out.println("Данная книга не найдена");
        } else {
            System.out.println(book);
        }
    }

    private static void deleteBook() {
        String title = inputTitle();
        bookshelf.delete(title);
    }

    private static String inputTitle() {
        System.out.println("Введите название книги");
        return scanner.nextLine();
    }

    private static void pressEnter() {
        System.out.println("Для продолжение работы нажмите клавишу Enter");
        String choice;
        do {
            scanner.nextLine();
            choice = scanner.nextLine();
        } while(!choice.equals(""));
    }
}
