package org.dsepulveda.ejercicio.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LasagnaTest {
    Lasagna lasagna;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Inicializando el test de la clase Lasagna");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Test de la clase Lasagna finalizado");
    }

    @BeforeEach
    void setUp() {
        lasagna = new Lasagna();
    }

    @Test
    @DisplayName("Testing total time in the oven")
    void testExpectedMinutesInOven() {
        assertEquals(40,this.lasagna.expectedMinutesInOven());
    }

    @Test
    @DisplayName("Testing remaining time in the oven")
    void testRemainingMinutesInOven() {
        assertEquals(10,lasagna.remainingMinutesInOven(30));
        assertEquals(0,lasagna.remainingMinutesInOven(40));
        assertEquals(30,lasagna.remainingMinutesInOven(10));
    }

    @Test
    @DisplayName("Testing preparation time")
    void testPreparationTimeInMinutes() {
        assertEquals(2,lasagna.preparationTimeInMinutes(1));
        assertEquals(8,lasagna.preparationTimeInMinutes(4));
        assertEquals(12,lasagna.preparationTimeInMinutes(6));
    }

    @Test
    @DisplayName("Testing total working time")
    void testTotalTimeInMinutes() {
        assertEquals(42,lasagna.totalTimeInMinutes(1, 40));
        assertEquals(26,lasagna.totalTimeInMinutes(3,20));
        assertEquals(27,lasagna.totalTimeInMinutes(6,15));
    }

    
}