package com.solvd.pattern.strategy;

public class Ship implements IWayToTrip {

    private final int speed;

    public Ship() {
        this.speed = 100;
    }

    public void travel() {
        System.out.println("Travel by ship.");
        System.out.println("Speed: " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

}
