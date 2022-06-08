package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


class EstanqueTest {
    Estanque estanque;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Estanque");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Estanque finalizado");
    }

    @BeforeEach
    void setUp() {
        estanque = new Estanque();
    }

    @Test
    @DisplayName("Prueba chequeo Estanque")
    void chequeoEstanqueTest() {
        assertEquals("Estanque lleno", estanque.chequeoEstanque(70));
        assertEquals("Estanque casi lleno", estanque.chequeoEstanque(65));
        assertEquals("Estanque 3/4", estanque.chequeoEstanque(50));
        assertEquals("Medio Estanque", estanque.chequeoEstanque(35));
        assertEquals("Suficiente", estanque.chequeoEstanque(21));
        assertEquals("Insuficiente", estanque.chequeoEstanque(19));
        assertEquals("Dato invalido", estanque.chequeoEstanque(80));
    }
}