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

    public MechanicalBalance(List wheelrate, List bumpStopRateUp, List bumpStopRateDn, List bumpStopWindow, long aRBFront, long aRBRear, long brakeTorque, long brakeBias) {

        this.aRBFront = aRBFront;
        this.aRBRear = aRBRear;
        this.brakeTorque = brakeTorque;
        this.brakeBias = brakeBias;
        this.wheelRate = wheelRate;
        this.bumpStopRateUp = bumpStopRateUp;
        this.bumpStopRateDn = bumpStopRateDn;
        this.bumpStopWindow = bumpStopWindow;
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
