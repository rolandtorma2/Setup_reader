package com.mycompany.setupreader;

public class Electronics {
    long tC1;
    long tC2;
    long abs;
    long eCUMap;
    long fuelMix;
    long telemetryLaps;

    public void printValues() {

        
        System.out.println("Traction Control data: ");
        System.out.println("Traction Control 1 power: " + this.tC1);
        System.out.println("Traction Control 2 power: " + this.tC2);
        
        System.out.println("Abs data: ");
        System.out.println("Abs power: " + this.abs);
        
        System.out.println("ECU data: ");
        System.out.println("ECU Mapping level: " + this.eCUMap);
        
        System.out.println("Fuel data: ");
        System.out.println("Fuel mix: " + this.fuelMix);
        
        System.out.println("Telemetry data: ");
        System.out.println("Telemetry laps: " + this.telemetryLaps + "\n");
    } 

    public Electronics(long tC1, long tC2, long abs, long eCUMap, long fuelMix, long telemetryLaps) {
        this.tC1 = tC1;
        this.tC2 = tC2;
        this.abs = abs;
        this.eCUMap = eCUMap;
        this.fuelMix = fuelMix;
        this.telemetryLaps = telemetryLaps;
        printValues();
    }

    public long gettC1() {
        return tC1;
    }

    public long gettC2() {
        return tC2;
    }

    public long getAbs() {
        return abs;
    }

    public long geteCUMap() {
        return eCUMap;
    }

    public long getFuelMix() {
        return fuelMix;
    }

    public long getTelemetryLaps() {
        return telemetryLaps;
    }

}
