package com.mycompany.setupreader;

/**
 * The Strategy class represents the strategic configuration for a car setup,
 * including parameters such as fuel, pit stops, tyre set, brake pad compounds,
 * and fuel consumption per lap.
 */

public class Strategy {

    JSONObject pitStrategy;
    long fuel;
    long nPitStops;
    long tyreSet;
    long frontBrakePadCompound;
    long rearBrakePadCompound;
    double fuelPerLap;

    /**
     * Constructs a new Strategy object with the specified parameters.
     *
     * @param fuel                  The amount of fuel available for the race.
     * @param nPitStops             The number of pit stops planned for the race.
     * @param tyreSet               The type of tyre set selected for the race.
     * @param frontBrakePadCompound The compound type of the front brake pads.
     * @param rearBrakePadCompound  The compound type of the rear brake pads.
     * @param fuelPerLap            The fuel consumption per lap during the race.
     */

    public Strategy(long fuel, long nPitStops, long tyreSet, long frontBrakePadCompound, long rearBrakePadCompound,
            double fuelPerLap, JSONObject pitStrategy) {
        this.fuel = fuel;
        this.nPitStops = nPitStops;
        this.tyreSet = tyreSet;
        this.frontBrakePadCompound = frontBrakePadCompound;
        this.rearBrakePadCompound = rearBrakePadCompound;
        this.fuelPerLap = fuelPerLap;
        this.pitStrategy = pitStrategy;
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
