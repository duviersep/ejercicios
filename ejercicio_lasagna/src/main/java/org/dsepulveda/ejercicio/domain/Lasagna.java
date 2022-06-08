package org.dsepulveda.ejercicio.domain;

public class Lasagna {
    private final int minutesInOven = 40;
    private int layer;

    public int expectedMinutesInOven(){
        return minutesInOven;
    }

    public int remainingMinutesInOven(int minutesInOven){
        return this.minutesInOven - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers){
        return numberOfLayers*2;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
        return (numberOfLayers*2) + minutesInOven;
    }
}
