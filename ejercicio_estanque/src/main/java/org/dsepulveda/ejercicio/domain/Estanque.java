package org.dsepulveda.ejercicio.domain;

import java.util.Scanner;

public class Estanque {
        private final double CAPACIDAD = 70;
        private double capacidadActual;

        public String chequeoEstanque(double capacidadActual) {
            if (capacidadActual == CAPACIDAD) {
                return "Estanque lleno";
            }
            if (capacidadActual >= 60 && capacidadActual < CAPACIDAD) {
                return "Estanque casi lleno";
            }
            if (capacidadActual >= 40 && capacidadActual < 60) {
                return "Estanque 3/4";
            }
            if (capacidadActual >= 35 && capacidadActual < 40) {
                return "Medio Estanque";
            }
            if (capacidadActual >= 20 && capacidadActual < 35) {
                return "Suficiente";
            }
            if (capacidadActual >= 1 && capacidadActual < 20) {
                return "Insuficiente";
            }
            return "Dato invalido";
        }

}
