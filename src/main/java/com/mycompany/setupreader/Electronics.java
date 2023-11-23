package com.mycompany.setupreader;

public class Electronics {
    long tC1;
    long tC2;
    long abs;
    long eCUMap;
    long fuelMix;
    long telemetryLaps;
    
    public Electronics(long tC1,long tC2, long abs,long eCUMap, long fuelMix,long telemetryLaps) {
        this.tC1 = tC1;
        this.tC2 = tC2;
        this.abs = abs;
        this.eCUMap = eCUMap;
        this.fuelMix = fuelMix;
        this.telemetryLaps = telemetryLaps;
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
