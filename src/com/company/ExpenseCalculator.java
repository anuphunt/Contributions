package com.company;

import java.util.List;

public class ExpenseCalculator {

    List<Participant> participants;
    double totalPrice;
    double cigarettePrice;
    double meatPrice;
    double jdPrice;
    double beerPrice;

    public ExpenseCalculator(List<Participant> participants, double totalPrice, double cigarettePrice, double meatPrice, double jdPrice, double beerPrice) {
        this.participants = participants;
        this.totalPrice = totalPrice;
        this.cigarettePrice = cigarettePrice;
        this.meatPrice = meatPrice;
        this.beerPrice = beerPrice;
        this.jdPrice = jdPrice;
    }

    public void calculate(){

        if(participants == null || participants.isEmpty()){
            System.out.println("Please add participants");
            return;
        }

        int jdDrinkers=0;
        int smokers=0;
        int meatEaters=0;
        int beerDrinkers=0;

        for(Participant p: participants){
            if(p.isSmoker) smokers++;
            if(!p.isVegetarian) meatEaters++;
            if(p.isBeerDrinker) beerDrinkers++;
            if(p.isJdDrinker) jdDrinkers++;
        }

        for(Participant p: participants){
            double toPay = (totalPrice - cigarettePrice-meatPrice-jdPrice-beerPrice)/participants.size();
            if(p.isJdDrinker) toPay += jdPrice/jdDrinkers;
            if(p.isBeerDrinker) toPay += beerPrice/beerDrinkers;
            if(!p.isVegetarian) toPay += meatPrice/meatEaters;
            if(p.isSmoker) toPay += cigarettePrice/smokers;

            System.out.printf("%s : $%.2f", p.name, toPay);
            System.out.println();
        }
    }

}
