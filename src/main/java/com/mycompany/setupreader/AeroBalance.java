package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class AeroBalance {

    List rideHeight = new ArrayList();
    List rodLength = new ArrayList();
    List reboundSlow = new ArrayList();
    List reboundFast = new ArrayList();
    
    public AeroBalance(List rideHeight,List rodLength,List reboundSlow,List reboundFast) {
        this.rideHeight = rideHeight;
        this.rodLength = rodLength;
        this.reboundSlow = reboundSlow;
        this.reboundFast = reboundFast;
    }

    public List getRideHeight() {
        return rideHeight;
    }

    public List getRodLength() {
        return rodLength;
    }

    public List getReboundSlow() {
        return reboundSlow;
    }

    public List getReboundFast() {
        return reboundFast;
    }
    
    
}
