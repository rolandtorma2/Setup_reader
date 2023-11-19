
package com.mycompany.jsonfilereader;

public class Strategy {
    long fuel;
    long nPitStops;
    long tyreSet;
    long frontBrakePadCompound;
    long rearBrakePadCompound;
    double fuelPerLap;
    

    public Strategy (long fuel,long nPitStops, long tyreSet,long frontBrakePadCompound,long rearBrakePadCompound, double fuelPerLap) {
        this.fuel = fuel;
        this.nPitStops = nPitStops;
        this.tyreSet = tyreSet;
        this.frontBrakePadCompound = frontBrakePadCompound;
        this.rearBrakePadCompound = rearBrakePadCompound;
        this.fuelPerLap = fuelPerLap;
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
