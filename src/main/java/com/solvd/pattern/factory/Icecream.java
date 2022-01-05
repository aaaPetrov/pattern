package com.solvd.pattern.factory;

public class Icecream implements MilkProduct {

    @Override
    public void eat() {
        System.out.println("You are eating icecream.");
    }
}
