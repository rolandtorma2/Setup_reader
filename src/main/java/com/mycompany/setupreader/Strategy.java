package com.mycompany.setupreader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * The Strategy class represents the strategic configuration for a vehicle during a race,
 * including settings for fuel, pit stops, tyre set, front and rear brake pad compounds, fuel consumption per lap,
 * and a detailed pit strategy.
 */
public class Strategy {

    // Variables to store strategy information
    JSONObject pitStrategy;
    long fuel;
    long nPitStops;
    long tyreSet;
    long frontBrakePadCompound;
    long rearBrakePadCompound;
    double fuelPerLap;

    /**
     * Constructs a Strategy instance with specified strategic configuration parameters.
     *
     * @param fuel The amount of fuel for the race.
     * @param nPitStops The number of planned pit stops.
     * @param tyreSet The selected tyre set for the race.
     * @param frontBrakePadCompound The compound of the front brake pads.
     * @param rearBrakePadCompound The compound of the rear brake pads.
     * @param fuelPerLap The fuel consumption per lap.
     * @param pitStrategy The detailed pit strategy as a JSONObject.
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

    /**
     * Gets the amount of fuel for the race in this Strategy configuration.
     *
     * @return The amount of fuel.
     */
    public long getFuel() {
        return fuel;
    }

    /**
     * Gets the number of planned pit stops in this Strategy configuration.
     *
     * @return The number of planned pit stops.
     */
    public long getnPitStops() {
        return nPitStops;
    }

    /**
     * Gets the selected tyre set for the race in this Strategy configuration.
     *
     * @return The selected tyre set.
     */
    public long getTyreSet() {
        return tyreSet;
    }

    /**
     * Gets the compound of the front brake pads in this Strategy configuration.
     *
     * @return The compound of the front brake pads.
     */
    public long getFrontBrakePadCompound() {
        return frontBrakePadCompound;
    }

    /**
     * Gets the compound of the rear brake pads in this Strategy configuration.
     *
     * @return The compound of the rear brake pads.
     */
    public long getRearBrakePadCompound() {
        return rearBrakePadCompound;
    }

    /**
     * Gets the fuel consumption per lap in this Strategy configuration.
     *
     * @return The fuel consumption per lap.
     */
    public double getFuelPerLap() {
        return fuelPerLap;
    }

    /**
     * Gets the detailed pit strategy as a JSONObject in this Strategy configuration.
     *
     * @return The detailed pit strategy.
     */
    public JSONObject pitStrategy() {
        return pitStrategy;
    }
}
