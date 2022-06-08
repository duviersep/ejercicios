package org.dsepulveda.ejercicio.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    public List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> searchBooksByName(String name){
        List<Book> foundBooksByName = books.stream()
                        .filter(book -> book.getName()
                        .contains(name))
                        .collect(Collectors.toList());

        return foundBooksByName;
    }

    public void searchBooksByAuthor(String author){
        /*List<Book> foundBooksByAuthor = books.stream()
                .filter(book -> book.getAuthors()
                        .stream()
                        .filter(a -> a.getName().contains(author))
                        .contains(author))
                .collect(Collectors.toList());

        return foundBooksByAuthor;*/

    }

    public int getTotalStock(){
        return books.stream()
                .mapToInt(book -> book.getStock())
                .sum();
    }

    public double getTotalPrice(){
        return books.stream()
                .mapToDouble(book -> book.getPrice())
                .sum();
    }
}
