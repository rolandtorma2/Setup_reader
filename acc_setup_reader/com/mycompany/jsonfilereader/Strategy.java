package com.mycompany.jsonfilereader;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

public class Strategy {

    JSONObject pitStrategy;
    long fuel;
    long nPitStops;
    long tyreSet;
    long frontBrakePadCompound;
    long rearBrakePadCompound;
    double fuelPerLap;

    public Strategy(long fuel, long nPitStops, long tyreSet, long frontBrakePadCompound, long rearBrakePadCompound, double fuelPerLap, JSONObject pitStrategy) {
        this.fuel = fuel;
        this.nPitStops = nPitStops;
        this.tyreSet = tyreSet;
        this.frontBrakePadCompound = frontBrakePadCompound;
        this.rearBrakePadCompound = rearBrakePadCompound;
        this.fuelPerLap = fuelPerLap;
        this.pitStrategy  = pitStrategy;
    }
     
    

    public long getFuel() {
        return fuel;
    }

    public long getnPitStops() {
        return nPitStops;
    }

    public long getTyreSet() {
        return tyreSet;
    }

    public long getFrontBrakePadCompound() {
        return frontBrakePadCompound;
    }

    public long getRearBrakePadCompound() {
        return rearBrakePadCompound;
    }

    public double getFuelPerLap() {
        return fuelPerLap;
    }

}
