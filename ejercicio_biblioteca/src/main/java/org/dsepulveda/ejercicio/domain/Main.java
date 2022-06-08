package org.dsepulveda.ejercicio.domain;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<Author> authorsList1;
    private static List<Author> authorsList2;
    private static Library library;

    public static void main(String[] args) {
        createAuthors();
        createLibrary();

        //List<Book> foundBooksByName = library.searchBooksByName("Naruto");
        //printFoundBooks(foundBooksByName);

        //List<Book> foundBooksByAuthor = library.searchBooksByAuthor("Lina");
        //printFoundBooks(foundBooksByAuthor);


    }

    public static void createAuthors(){
        authorsList1 = new ArrayList<>();
        authorsList1.add(new Author("Duvier Sepulveda","duvier@mail.com","M"));
        authorsList1.add(new Author("Lina Jaramillo","lina@mail.com","F"));

        authorsList2 = new ArrayList<>();
        authorsList2.add(new Author("Alonso Naranjo","alonso@mail.com","M"));
        authorsList2.add(new Author("Julian Arbelaez", "julian@mail.com", "M"));
    }

    public static void createLibrary(){
        library = new Library();
        library.addBook(new Book("One Piece",200,100, authorsList1));
        library.addBook(new Book("Naruto",200,10, authorsList1));
        library.addBook(new Book("Dragon Ball",300,50, authorsList2));
        library.addBook(new Book("Naruto Shippuden",800,25, authorsList2));
    }

    public static void printFoundBooks(List<Book> foundBooks){
        for(Book book : foundBooks){
            System.out.println("\nName: " + book.getName()
                    + "\nPrice: " + book.getPrice()
                    + "\nStock: " + book.getStock() + "\n");
            printAuthors(book.getAuthors());
        }

    }

    public static void printAuthors(List<Author> authors){
        System.out.println("\nAuthors: ");
        for(Author a : authors){
            System.out.println("\nName: " + a.getName()
                    + "\nE-mail: " + a.getEmail()
                    + "\nGender: " + a.getGender() + "\n");
        }
    }
}
