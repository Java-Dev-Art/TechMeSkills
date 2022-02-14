package com.tmc.module.library;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
@Builder
@ToString
public class Reader {
    private String firstName;
    private String lastName;
    private int id;
    private int telNumber;
    private String faculty;
    public String dayOfBirthDay;
    public static List<Book> bookList = new ArrayList<>();

    public void takeBook(Book book) {
        bookList.add(book);
        ourBook();
    }

    public void returnBook(Book book) {
        bookList.remove(book);
        System.out.printf("\nВернул книгу\n%s - %s|Осталось вернуть книг %d", book.getAuthor(), book.getName(), bookList.size());
    }

    private void ourBook() {
        System.out.println("Читатель взял из бибототеки:");
        for (Book bookL : bookList) {
            System.out.printf("|" + bookL.getName());
        }
        System.out.printf("\nВсего количество книг %d\n", bookList.size());
    }
}
