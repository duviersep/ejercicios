package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class NombreTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Nombre");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Nombre finalizado");
    }

    @Test
    void obtenerNombreLargoTest() {
        Nombre nombre = new Nombre();
        assertEquals("Monkey D. Luffy", nombre.obtenerNombreLargo("Son Goku", "Monkey D. Luffy", "Naruto Uzumaki"));
    }
}