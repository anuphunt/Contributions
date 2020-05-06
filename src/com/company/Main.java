package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    static double totalPrice = 79.66 + 7.60 + 39.33 - 7.63 - 56.40;
    static double cigarettePrice = 7.63*2;
    static double beerPrice = 0;
    static double jdPrice = 0;
    static double meatPrice = 0;

    static List<Participant> participants;

    public static void main(String[] args) {
            participants = new ArrayList<Participant>();
            //participants.add(new Participant("Bishwas", true, false, true, true));
            participants.add(new Participant("Dipak", true, false, true, true));
            participants.add(new Participant("Navin", false, true, true, true));
            participants.add(new Participant("Pradip", true, false, true, true));
            participants.add(new Participant("Ayush", true, false, true, false));
            participants.add(new Participant("Samsher", false, false, true, true));
            participants.add(new Participant("Anup", false, false, true, false));
            participants.add(new Participant("Caesar", false, false, false, false));

            ExpenseCalculator calculator = new ExpenseCalculator(participants, totalPrice, cigarettePrice, meatPrice,jdPrice, beerPrice);
            calculator.calculate();
    }
}
