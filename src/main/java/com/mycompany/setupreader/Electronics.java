package com.mycompany.setupreader;

    /**
     * The Electronics class represents the electronic configuration for a car setup,
     * including parameters such as traction control, ABS, ECU mapping, fuel mix, and telemetry settings.
     */

public class Electronics {
    long tC1;
    long tC2;
    long abs;
    long eCUMap;
    long fuelMix;
    long telemetryLaps;
    
    /**
     * Constructs a new Electronics object with the specified parameters.
     *
     * @param tC1            The power level of Traction Control 1.
     * @param tC2            The power level of Traction Control 2.
     * @param abs            The power level of ABS.
     * @param eCUMap         The mapping level of the Engine Control Unit (ECU).
     * @param fuelMix        The fuel mixture setting.
     * @param telemetryLaps The number of telemetry laps configured.
     */

    public Electronics(long tC1, long tC2, long abs, long eCUMap, long fuelMix, long telemetryLaps) {
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
