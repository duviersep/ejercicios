package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NumeroTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Numero");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Numero finalizado");
    }


    @Test
    void testFindNumbers() {
        Integer numbers[] = {5,2,3,2,7,0};
        Numero numero = new Numero();
        assertEquals("3 7", numero.findNumbers(numbers));
    }

    @Test
    void testNumbersNotFound() {
        Integer numbers[] = {5,2,1,2,7,0};
        Numero numero = new Numero();
        assertEquals("No se encontraron numeros que sumados den 10", numero.findNumbers(numbers));
    }
}