package org.dsepulveda.ejercicio.domain;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Nombre nombre = new Nombre();
        String nombre1;
        String nombre2;
        String nombre3;

        nombre1 = JOptionPane.showInputDialog("Ingrese nombre #1", null);
        nombre2 = JOptionPane.showInputDialog("Ingrese nombre #2", null);
        nombre3 = JOptionPane.showInputDialog("Ingrese nombre #3", null);

        JOptionPane.showMessageDialog(null,"Nombre mas largo: " + nombre.obtenerNombreLargo(nombre1, nombre2, nombre3));
    }
}
