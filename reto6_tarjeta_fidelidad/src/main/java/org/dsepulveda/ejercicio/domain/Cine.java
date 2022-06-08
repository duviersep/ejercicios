package org.dsepulveda.ejercicio.domain;

import java.util.Arrays;

public class Cine {

    public static boolean shouldBuyFidelity(int times){
        final int priceEntrance = 12;
        final int FidelityCard = 250;
        final double discount = 0.75;
        int priceWithoutFidelity;
        double priceWithFidelity;
        double priceWithDiscountParcial = 12;
        double priceWithDiscountTotal = 0;


        priceWithoutFidelity = times * priceEntrance;
        System.out.println("priceWithoutFidelity = " + priceWithoutFidelity);

        for (int i=0; i<times; i++) {
            priceWithDiscountParcial = priceWithDiscountParcial * discount;
            priceWithDiscountTotal += priceWithDiscountParcial;
        }

        priceWithFidelity = FidelityCard + priceWithDiscountTotal;
        System.out.println("priceWithFidelity = " + priceWithFidelity);

        if(priceWithFidelity < priceWithoutFidelity){
            return true;
        }else{
            return false;
        }
    }
}
