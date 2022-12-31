package com.sandersgutierrez.javatutorial;

import com.sandersgutierrez.javatutorial.oo.ACMEBicycle;
import com.sandersgutierrez.javatutorial.oo.Bicycle;
import com.sandersgutierrez.javatutorial.oo.MountainBike;

public class DemoApplication {
    public static void main(String[] args) {
        Bicycle bike1 = new ACMEBicycle();
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        Bicycle bike2 = new ACMEBicycle(0, 0, 1);
        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

        Bicycle mountainBike1 = new MountainBike(0, 0, 1, 1);
        mountainBike1.changeCadence(50);
        mountainBike1.speedUp(10);
        mountainBike1.changeGear(2);
        mountainBike1.changeCadence(40);
        mountainBike1.speedUp(10);
        mountainBike1.changeGear(3);
        mountainBike1.applyBrakes(10);
        mountainBike1.printStates();
    }
}
