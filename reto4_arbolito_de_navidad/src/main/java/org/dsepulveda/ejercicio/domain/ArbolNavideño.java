package org.dsepulveda.ejercicio.domain;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ArbolNavideño {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int alturaArbol = pedirDatos();
        pintarArbol(alturaArbol);

    }

    public static int pedirDatos(){
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite la Altura del Arbol:"));
        return altura;
    }

    public static void pintarArbol(int nFilas){
        int nCol = 1;
        //Calculo las dimensiones de mi matriz
        for(int i=1; i<nFilas; i++){
            nCol += 2;
        }

        String arbol[][] = new String[nFilas][nCol];
        int mitad = nCol/2;
        int empiezaAst;
        int terminaAst;

        for(int i=0; i<nFilas+2; i++){
            empiezaAst = (mitad - i);
            terminaAst = (mitad + i);

            for(int j=0; j<nCol; j++){
                if(i<nFilas){
                    if ((j >= empiezaAst) && (j <= terminaAst)) {
                        System.out.print("*");
                    } else {
                        System.out.print("_");
                    }
                }else{
                    if (j == mitad) {
                        System.out.print("#");
                    } else {
                        System.out.print("_");
                    }
                }
            }
            System.out.println("");
        }
    }
}
