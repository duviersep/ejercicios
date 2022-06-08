package org.dsepulveda.ejercicio.domain;

public class Numero {

    public String findNumbers(Integer[] numbers){
        Integer numberToCompare;
        Integer complementNumber;

        for(int i=0; i<numbers.length; i++){
            numberToCompare = numbers[i];
            for(int j=0; j<numbers.length; j++){
                if(i == j){
                    continue;
                }
                if(numberToCompare + numbers[j] == 10){
                    return numberToCompare.toString() + " " + numbers[j].toString();

                }
            }
        }
        return "No se encontraron numeros que sumados den 10";
    }
}
