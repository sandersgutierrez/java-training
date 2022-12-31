package com.sandersgutierrez.javatutorial.oo;

public class ACMEBicycle implements Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    public ACMEBicycle() {
    }

    public ACMEBicycle(int startCadence, int startSpeed, int startGear) {
        cadence = startCadence;
        speed = startSpeed;
        gear = startGear;
    }

    public void changeCadence(int cadence) {
        this.cadence = cadence;
    }

    public void changeGear(int gear) {
        this.gear = gear;
    }

    public void speedUp(int speed) {
        this.speed = this.speed + speed;
    }

    public void applyBrakes(int speed) {
        this.speed = this.speed - speed;
    }

    public void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}
