package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class MechanicalBalance {

    List wheelRate = new ArrayList();
    List bumpStopRateUp = new ArrayList();
    List bumpStopRateDn = new ArrayList();
    List bumpStopWindow = new ArrayList();
    long aRBFront;
    long aRBRear;
    long brakeTorque;
    long brakeBias;

    public void printValues() {

        System.out.println("ARB Data: ");
        System.out.println("ARB Front: " + this.aRBFront);
        System.out.println("ARB Rear: " + this.aRBRear + "\n");

        System.out.println("Wheelrate data: ");
        System.out.println("Wheelrate: Front left: " + wheelRate.get(Utils.WHEELRATE_FRONT_LEFT));
        System.out.println("Wheelrate: Front right: " + wheelRate.get(Utils.WHEELRATE_FRONT_RIGHT));
        System.out.println("Wheelrate: Rear left: " + wheelRate.get(Utils.WHEELRATE_REAR_LEFT));
        System.out.println("Wheelrate: Rear right: " + wheelRate.get(Utils.WHEELRATE_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop Rateup data: ");
        System.out.println("Bumpstop Rateup: Front Left: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_FRONT_LEFT));
        System.out.println("Bumpstop Rateup: Front Right: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_FRONT_RIGHT));
        System.out.println("Bumpstop Rateup: Rear Left: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_REAR_LEFT));
        System.out.println("Bumpstop Rateup: Rear Right: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop Ratedown data: ");
        System.out.println("Bumpstop Ratedown: Front Left: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_FRONT_LEFT));
        System.out.println("Bumpstop Ratedown: Front Right: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_FRONT_RIGHT));
        System.out.println("Bumpstop Ratedown: Rear Left: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_REAR_LEFT));
        System.out.println("Bumpstop Ratedown: Rear Right: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop window data: ");
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_FRONT_LEFT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_FRONT_RIGHT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_REAR_LEFT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_REAR_RIGHT) + "\n");

        System.out.println("Brake data: ");
        System.out.println("Braketorque: " + this.brakeTorque);
        System.out.println("Brake Bias: " + this.brakeBias + "\n");
    }

    public MechanicalBalance(List wheelrate, List bumpStopRateUp, List bumpStopRateDn, List bumpStopWindow,
            long aRBFront, long aRBRear, long brakeTorque, long brakeBias) {

        this.aRBFront = aRBFront;
        this.aRBRear = aRBRear;
        this.brakeTorque = brakeTorque;
        this.brakeBias = brakeBias;
        this.wheelRate = wheelRate;
        this.bumpStopRateUp = bumpStopRateUp;
        this.bumpStopRateDn = bumpStopRateDn;
        this.bumpStopWindow = bumpStopWindow;
        printValues();
    }

    public List getWheelRate() {
        return wheelRate;
    }

    public List getBumpStopRateUp() {
        return bumpStopRateUp;
    }

    public List getBumpStopRateDn() {
        return bumpStopRateDn;
    }

    public List getBumpStopWindow() {
        return bumpStopWindow;
    }

    public long getaRBFront() {
        return aRBFront;
    }

    public long getaRBRear() {
        return aRBRear;
    }

    public long getBrakeTorque() {
        return brakeTorque;
    }

    public long getBrakeBias() {
        return brakeBias;
    }

}
