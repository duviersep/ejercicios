package org.dsepulveda.ejercicio.domain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception0{
        double nota;
        double acumuladores[] = new double[3]; // 0 - mayorQue5, 1 - menorQue4, 2 - Total
        int contadores[] = new int[4]; // 0 - mayorQue5, 1 - menorQue4, 2 - Total, 3 - igualA1

        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<20; i++){
            do {
                System.out.print("Digite la nota #" + (i+1) + ": ");
                nota = entrada.nextInt();

                if(nota == 0){
                    throw new Exception0();
                }
            }while(nota<1 || nota>7);

            acumuladores[2] += nota;
            contadores[2]++;

            if(nota>5){
                acumuladores[0] += nota;
                contadores[0]++;
            }else if(nota<4){
                acumuladores[1] += nota;
                contadores[1]++;
            }

            if(nota == 1){
                contadores[3]++;
            }
        }

        System.out.println("\nPromedio total de notas: " + acumuladores[2]/contadores[2]);
        System.out.println("Promedio notas >5: " + acumuladores[0]/contadores[0]);
        System.out.println("Promedio notas <4: " + acumuladores[1]/contadores[1]);
        System.out.println("Numero de notas iguales a 1: " + contadores[3]);
    }


}
