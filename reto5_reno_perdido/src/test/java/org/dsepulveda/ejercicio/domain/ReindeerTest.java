package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ReindeerTest {


    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Reindeer");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Reindeer finalizado");
    }


    @Test
    @DisplayName("Testing missing reindeer")
    void testMissingReindeer() {
        int[] idReindeers = {0,1,2,3,4,6,7,8};

        int lostReindeer = Reindeer.missingReindeer(idReindeers);

        assertEquals(5, lostReindeer);
    }
}