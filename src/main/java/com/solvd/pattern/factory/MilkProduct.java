package com.solvd.pattern.factory;

public interface MilkProduct {

    default void eat() {
        System.out.println("You can't eat abstract product :)");
    }

}
