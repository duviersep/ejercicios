package org.dsepulveda.ejercicio.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Regalo {

    public static void main(String[] args) {
        String regalos = "bici coche balon _playstation bici coche peluche";

        List<String> regalosSeparados = Arrays.asList(regalos.split(" "));

        List<String> regalosSinGuion = new ArrayList<>();

        for(String regalo : regalosSeparados){
            if(!regalo.startsWith("_")){
                regalosSinGuion.add(regalo);
            }

        }
        Map<String, Long> ocurrencias = regalosSinGuion.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        ocurrencias.forEach((key, value)-> System.out.println(key + ": " + value));
    }
}
