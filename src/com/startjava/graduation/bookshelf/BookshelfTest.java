package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    private static final int quit = 5;

    public static void main( String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        if (bookshelf.getNumberBooks() == 0) {
            System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        } else {
            System.out.println("В шкафу книг -" + bookshelf.getNumberBooks() +
                    ", Свободных полок -" + bookshelf.freeNumberShelves());
        }
        do {
            menu();
           // chooseMenuItem(scanner, bookshelf);
        }while(chooseMenuItem(scanner, bookshelf) != quit);
    }

    public static void menu() {
        System.out.println("""
          1. save book
          2. delete book
          3. find book
          4. clear bookshelf
          5. quit
          """);
        System.out.println("Введите номер команды");
    }

    public static int chooseMenuItem(Scanner scanner, Bookshelf bookshelf) {
        int itemMenu = scanner.nextInt();
        if(itemMenu == 1) {
            bookshelf.saveBooks();
        }
        if(itemMenu == 2) {
            bookshelf.deleteBooks();
        }
        if(itemMenu == 3) {
            bookshelf.findBooks();
        }
        if(itemMenu == 4) {
            bookshelf.clearBookshelf();
        }
        if(itemMenu == 5) {
            return quit;
        }
        return itemMenu;
    }
}
