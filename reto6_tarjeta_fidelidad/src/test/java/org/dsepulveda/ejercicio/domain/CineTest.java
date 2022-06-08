package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CineTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Cine");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Cine finalizado");
    }


    @Test
    void testShouldBuyFidelity() {

        assertEquals(false, Cine.shouldBuyFidelity(3));
        assertEquals(false, Cine.shouldBuyFidelity(1));
        assertEquals(true, Cine.shouldBuyFidelity(100));
    }
}