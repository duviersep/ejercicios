package org.dsepulveda.ejercicio.domain;

import java.util.List;

public class Book {
    private String name;
    private double price;
    private int stock;
    private List<Author> authors;

    public Book(String name, double price, int stock,List<Author> authors){
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.authors = authors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author){
        this.authors.add(author);
    }

    public void deleteAuthor(String author){
        authors.removeIf(a -> a.getName().contains(author));
    }
}
