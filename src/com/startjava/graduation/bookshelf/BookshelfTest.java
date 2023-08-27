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
            printMenu();
        } while(chooseMenuItem(scanner, bookshelf) != quit);
    }

    public static void printMenu() {
        System.out.println("""
          1. save book
          2. find book
          3. delete book
          4. clear bookshelf
          5. quit
          """);
    }

    private static void printBookshelf(Bookshelf bookshelf) {
        if(bookshelf.getNumberBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            Book[] books = bookshelf.getBooks();
            System.out.println("В шкафу книг - " + bookshelf.getNumberBooks() +
                    ", Свободных полок - " + bookshelf.getCountFreeShelves());
            for(Book book: books) {
                System.out.println("|" + book + " ".repeat( bookshelf.getMaxLength()
                    - book.getLength()) + "|");
                System.out.println("|" + "-".repeat(bookshelf.getMaxLength()) + "|");
                }
            System.out.println("|" + " ".repeat(bookshelf.getMaxLength()) + "|\n");
        }
    }

    private static int chooseMenuItem(Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите номер команды");
        String itemMenu = scanner.nextLine();
        switch (itemMenu) {
            case "1" -> saveBook(scanner, bookshelf);
            case "2" -> findBook(scanner, bookshelf);
            case "3" -> deleteBook(scanner, bookshelf);
            case "4" -> bookshelf.clearBookcase();
            case "5" -> {return quit;}
            default -> System.out.println("Дакого номера нет. Введите номер из списка. ");
        }
        pressEnter(scanner);
        return 0;
    }

    private static Book saveBook( Scanner scanner, Bookshelf bookshelf) {
        System.out.println("Введите автора");
        String author = scanner.nextLine();
        String title = inputTitle(scanner);
        System.out.println("Введите год издания");
        int yearsPublishing = scanner.nextInt();
        scanner.nextLine();
        Book book = new Book(author, title, yearsPublishing);
        bookshelf.save(book);
        return book;
    }

    private static void findBook(Scanner scanner, Bookshelf bookshelf) {
        String findTitle = inputTitle(scanner);
        Book book = bookshelf.find(findTitle);
        if(book == null) {
            System.out.println("Данная книга не найдена");
        } else {
            System.out.println(book);
        }
    }

    private static void deleteBook(Scanner scanner, Bookshelf bookshelf) {
        String findTitle = inputTitle(scanner);
        bookshelf.delete(findTitle);
    }

    private static String inputTitle(Scanner scanner) {
        System.out.println("Введите название книги");
        return scanner.nextLine();
    }

    private static void pressEnter(Scanner scanner) {
        System.out.println("Для продолжение работы нажмите клавишу Enter");
        String choice;
        do {
            scanner.nextLine();
            choice = scanner.nextLine();
        } while(!choice.equals(""));
    }
}
