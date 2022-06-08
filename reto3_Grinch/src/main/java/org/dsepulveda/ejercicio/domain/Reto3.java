package org.dsepulveda.ejercicio.domain;

import java.util.Stack;

public class Reto3 {
    public static void main(String[] args) {
        String[] arrayRegalos = {"bici coche (balon) bici coche peluche",
                "(muneca) consola bici",
                "bici coche (balon bici coche",
                "peluche (bici [coche) bici coche balon",
                "(peluche {) bici",
                "() bici"};

        boolean valido = false;
        int n = 1;

        for (String regalo : arrayRegalos) {
            valido = regalosValidos(regalo);
            System.out.println("Lista " + n + ": " + valido);
            n++;
        }
    }

    public static boolean regalosValidos(String regalo){
        Stack <Character> pilaSimbolos = new Stack<>();
        char[] arrayLetras = regalo.toCharArray();
        boolean parentesisVacios = false;

        for(char letra : arrayLetras){
            switch (letra){
                case '(':
                    pilaSimbolos.push(letra);
                    parentesisVacios = true;
                    break;
                case ')':
                    if(!pilaSimbolos.empty() && parentesisVacios){
                        return false;
                    }else if(!pilaSimbolos.empty()){
                        pilaSimbolos.pop();
                    }else{
                        return false;
                    }
                    break;
                case '{':
                case '[':
                case '}':
                case ']': return false;
                default: parentesisVacios = false;
            }
        }

        if(pilaSimbolos.empty()){
            return true;
        }else{
            return false;
        }
    }
}
