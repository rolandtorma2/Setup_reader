package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class AeroBalance {

    List rideHeight = new ArrayList();
    List rodLength = new ArrayList();
    List brakeDuct = new ArrayList();
    long splitter;
    long rearWing;

    public AeroBalance(List rideHeight, List rodLength, List brakeDuct, long splitter, long rearWing) {
        this.rideHeight = rideHeight;
        this.rodLength = rodLength;
        this.brakeDuct = brakeDuct;
        this.splitter = splitter;
        this.rearWing = rearWing;

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
