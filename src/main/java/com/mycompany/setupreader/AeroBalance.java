package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class AeroBalance {

    List rideHeight = new ArrayList();
    List rodLength = new ArrayList();
    List brakeDuct = new ArrayList();
    long splitter;
    long rearWing;

    public void printValues() {

        System.out.println("Ride heightt data: \n");
        System.out.println("Ride height front left: " + this.rideHeight.get(Utils.RIDE_HEIGHT_FRONT_LEFT));
        System.out.println("Ride height front right: " + this.rideHeight.get(Utils.RIDE_HEIGHT_FRONT_RIGHT));
        System.out.println("Ride height rear left: " + this.rideHeight.get(Utils.RIDE_HEIGHT_REAR_LEFT));
        System.out.println("Ride height rear right: " + this.rideHeight.get(Utils.RIDE_HEIGHT_REAR_RIGHT) + "\n");

        System.out.println("Rod length data: \n");
        System.out.println("Rod length front left: " + this.rodLength.get(Utils.ROD_LENGTH_FRONT_LEFT));
        System.out.println("Rod length front right: " + this.rodLength.get(Utils.ROD_LENGTH_FRONT_RIGHT));
        System.out.println("Rod length rear left: " + this.rodLength.get(Utils.ROD_LENGTH_REAR_LEFT));
        System.out.println("Rod length rear right: " + this.rodLength.get(Utils.ROD_LENGTH_REAR_RIGHT) + "\n");

        System.out.println("Brake duct data: \n");
        System.out.println("Brake duct front left: " + this.brakeDuct.get(Utils.BRAKE_DUCT_FRONT_LEFT));
        System.out.println("Brake duct front right: " + this.brakeDuct.get(Utils.BRAKE_DUCT_FRONT_RIGHT) + "\n");

        System.out.println("Aerodynamics data: \n");
        System.out.println("Front Splitter: " + splitter);

        System.out.println("Rear wing: " + rearWing + "\n");
    }

    public AeroBalance(List rideHeight, List rodLength, List brakeDuct, long splitter, long rearWing) {
        this.rideHeight = rideHeight;
        this.rodLength = rodLength;
        this.brakeDuct = brakeDuct;
        this.splitter = splitter;
        this.rearWing = rearWing;
        printValues();
    }

    public List getRideHeight() {
        return rideHeight;
    }

    public List getRodLength() {
        return rodLength;
    }

    public List getBrakeDuct() {
        return brakeDuct;
    }

    public long getSplitter() {
        return splitter;
    }

    public long getRearWing() {
        return rearWing;
    }

}
