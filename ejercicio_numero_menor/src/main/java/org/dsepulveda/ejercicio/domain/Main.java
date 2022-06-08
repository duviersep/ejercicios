package org.dsepulveda.ejercicio.domain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cantidad = 0;

        do {
            System.out.print("Ingrese la cantidad de numeros a ingresar (mínimo 10): ");
            cantidad = entrada.nextInt();
        }while(cantidad<10);

        int numeroMenor = 99999;
        for(int i=0; i<cantidad; i++){
            System.out.print((i+1) + ". Digite numero: ");
            numero = entrada.nextInt();

            if(numero<numeroMenor){
                numeroMenor=numero;
            }
        }

        if(numeroMenor<10){
            System.out.println("El numero menor " + numeroMenor + " es menor que 10");
        }else{
            System.out.println("El numero menor " + numeroMenor + " es mayor o igual a 10");
        }
    }
}
