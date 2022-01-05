package com.solvd.pattern.strategy;

public class Foot implements IWayToTrip {

    private final int speed;

    public Foot() {
        this.speed = 10;
    }

    public void travel() {
        System.out.println("Travel on foot.");
        System.out.println("Speed: " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }

}
