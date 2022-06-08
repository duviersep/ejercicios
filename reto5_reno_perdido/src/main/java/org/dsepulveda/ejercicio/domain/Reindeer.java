package org.dsepulveda.ejercicio.domain;

import java.util.Arrays;

public class Reindeer {

    public static int missingReindeer(int[] idReindeers){
        Arrays.sort(idReindeers);

        int idMax = idReindeers[idReindeers.length -1];
        Integer lostReinder = null;

        for (int i = 0; i <= idMax; i++) {
            if(idReindeers[i] != i){
                lostReinder = i;
                break;
            }
        }

        if(lostReinder == null){
            lostReinder = ++idMax;
        }

        return lostReinder;
    }
}
