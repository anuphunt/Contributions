package com.company;

public class Participant {
    String name;
    boolean isSmoker;
    boolean isBeerDrinker;
    boolean isJdDrinker;
    boolean isVegetarian;

    public Participant(String name, boolean isSmoker, boolean isVegetarian, boolean isBeerDrinker, boolean isJdDrinker) {
        this.name = name;
        this.isSmoker = isSmoker;
        this.isVegetarian = isVegetarian;
        this.isBeerDrinker = isBeerDrinker;
        this.isJdDrinker = isJdDrinker;
    }
}
