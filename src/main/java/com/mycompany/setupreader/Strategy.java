
package com.mycompany.setupreader;

public class Strategy {
    long fuel;
    long nPitStops;
    long tyreSet;
    long frontBrakePadCompound;
    long rearBrakePadCompound;
    double fuelPerLap;

    public Strategy(long fuel, long nPitStops, long tyreSet, long frontBrakePadCompound, long rearBrakePadCompound,
            double fuelPerLap) {
        this.fuel = fuel;
        this.nPitStops = nPitStops;
        this.tyreSet = tyreSet;
        this.frontBrakePadCompound = frontBrakePadCompound;
        this.rearBrakePadCompound = rearBrakePadCompound;
        this.fuelPerLap = fuelPerLap;
    }
}
