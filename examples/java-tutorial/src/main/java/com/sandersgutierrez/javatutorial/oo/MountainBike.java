package com.sandersgutierrez.javatutorial.oo;

public class MountainBike extends ACMEBicycle {
    int seatHeight;

    public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear + " seatHeight:" + seatHeight);
    }
}
