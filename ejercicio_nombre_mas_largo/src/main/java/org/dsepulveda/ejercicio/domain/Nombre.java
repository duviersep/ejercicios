package org.dsepulveda.ejercicio.domain;

public class Nombre {

    public String obtenerNombreLargo(String nombre1, String nombre2, String nombre3){
        if(nombre1.length()>nombre2.length() && nombre1.length()>nombre3.length()){
            return nombre1;
        }else if(nombre2.length()>nombre1.length() && nombre2.length()>nombre3.length()){
            return nombre2;
        }else if(nombre3.length()>nombre1.length() && nombre3.length()>nombre2.length()){
            return nombre3;
        }
        return "Los nombres tienen la misma cantidad de letras";
    }
}
