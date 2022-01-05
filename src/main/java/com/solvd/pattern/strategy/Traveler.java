package com.solvd.pattern.strategy;

public class Traveler {

    private String name;
    private IWayToTrip wayToTrip;

    public Traveler(String name) {
        this.name = name;
        this.wayToTrip = new Foot();
    }

    public void travel() {
        this.wayToTrip.travel();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IWayToTrip getWayToTrip() {
        return wayToTrip;
    }

    public void setWayToTrip(IWayToTrip wayToTrip) {
        this.wayToTrip = wayToTrip;
    }

}
