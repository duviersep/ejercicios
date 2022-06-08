package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class LibraryTest {
    List<Author> authorsList1;
    List<Author> authorsList2;
    Library library;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Library");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Library finalizado");
    }

    @BeforeEach
    void setUp() {

        authorsList1 = new ArrayList<>();
        authorsList1.add(new Author("Duvier Sepulveda","duvier@mail.com","M"));
        authorsList1.add(new Author("Lina Jaramillo","lina@mail.com","F"));

        authorsList2 = new ArrayList<>();
        authorsList2.add(new Author("Alonso Naranjo","alonso@mail.com","M"));
        authorsList2.add(new Author("Julian Arbelaez", "julian@mail.com", "M"));

        library = new Library();

    }

    @Test
    void testAddBook() {
        library.addBook(new Book("One Piece",200,100, authorsList1));
        library.addBook(new Book("Naruto",200,10, authorsList1));
        library.addBook(new Book("Dragon Ball",300,50, authorsList2));
        library.addBook(new Book("Naruto Shippuden",800,25, authorsList2));

        assertEquals(4,library.books.size());
    }

    @Test
    @DisplayName("Testing total price")
    void testGetTotalPrice() {
        library.addBook(new Book("One Piece",200,100, authorsList1));
        library.addBook(new Book("Naruto",200,10, authorsList1));

        assertEquals(400,library.getTotalPrice());
    }

    @Test
    @DisplayName("Testing total stock")
    void testGetTotalStock() {
        library.addBook(new Book("Dragon Ball",300,50, authorsList2));
        library.addBook(new Book("Naruto Shippuden",800,25, authorsList2));

        assertEquals(75,library.getTotalStock());
    }

    @Test
    @DisplayName("Testing search book by name")
    void testSearchBooksByName() {
        library.addBook(new Book("Dragon Ball",300,50, authorsList2));
        library.addBook(new Book("Naruto Shippuden",800,25, authorsList2));
        library.addBook(new Book("One Piece",200,100, authorsList1));
        library.addBook(new Book("Naruto",200,10, authorsList1));

        assertEquals(2,library.searchBooksByName("Naruto").size());
    }
}