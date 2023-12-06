package com.mycompany.setupreader;

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

    public void printValues() {

        System.out.println("Default fuel: " + this.fuel);
        System.out.println("Number of Pitstops: " + this.nPitStops);
        System.out.println("Tyre set: " + this.tyreSet);
        System.out.println("Front brake pad compound: " + this.frontBrakePadCompound);
        System.out.println("Rear brake pad compound: " + this.rearBrakePadCompound + "\n");
        System.out.println("Fuel per laps: " + this.fuelPerLap + "\n");
        
        // TODO: Finish it later

        /*System.out.println("Pit strategy data: ");

        System.out.println("Pit strategy: fuel to add: " + pitStrategy.get("fuelToAdd"));
        System.out.println("Pit strategy: Tyre set: " + pitStrategy.get("tyreSet"));
        System.out.println("Pit strategy: Tyres: Tyre compound: " + tyres.get("tyreCompound"));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Front Left: " + tyrePressures.get(FRONT_LEFT));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Front Right: " + tyrePressures.get(FRONT_RIGHT));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Rear Left: " + tyrePressures.get(REAR_LEFT));
        System.out.println("Pit strategy: Tyres: Tyre pressures: Rear Right: " + tyrePressures.get(REAR_RIGHT));
        System.out.println("Pit strategy: Front brakepad compound: " + pitStrategy.get("frontBrakePadCompound"));
        System.out.println("Pit strategy: Rear brakepad compound:: " + pitStrategy.get("rearBrakePadCompound") + "\n"); */

    }

    public Strategy(long fuel, long nPitStops, long tyreSet, long frontBrakePadCompound, long rearBrakePadCompound,
            double fuelPerLap, JSONObject pitStrategy) {
        this.fuel = fuel;
        this.nPitStops = nPitStops;
        this.tyreSet = tyreSet;
        this.frontBrakePadCompound = frontBrakePadCompound;
        this.rearBrakePadCompound = rearBrakePadCompound;
        this.fuelPerLap = fuelPerLap;
        this.pitStrategy = pitStrategy;
        printValues();
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
