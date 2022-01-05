package com.solvd.pattern.factory;

public class Milk implements MilkProduct {

    @Override
    public void eat() {
        System.out.println("You are drinking milk.");
    }

}
