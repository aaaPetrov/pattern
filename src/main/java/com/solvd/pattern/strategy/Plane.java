package com.solvd.pattern.strategy;

public class Plane implements IWayToTrip {

    private final int speed;

    public Plane() {
        this.speed = 1000;
    }

    public void travel() {
        System.out.println("Travel by plane.");
        System.out.println("Speed: " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

}
