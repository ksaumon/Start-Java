package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        menu();
        bookshelf.saveBooks();
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
}
