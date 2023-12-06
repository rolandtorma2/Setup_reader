package com.mycompany.setupreader;

/**
 * The Electronics class represents the electronic configuration of a vehicle,
 * including traction control settings, ABS (Anti-lock Braking System) setting,
 * ECU (Engine Control Unit) map, fuel mix setting, and telemetry laps setting.
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
     * @param tC1           The power level of Traction Control 1.
     * @param tC2           The power level of Traction Control 2.
     * @param abs           The power level of ABS.
     * @param eCUMap        The mapping level of the Engine Control Unit (ECU).
     * @param fuelMix       The fuel mixture setting.
     * @param telemetryLaps The number of telemetry laps configured.
     */

    /**
     * Constructs an Electronics instance with specified electronic configuration
     * parameters.
     *
     * @param tC1           The traction control setting for condition 1.
     * @param tC2           The traction control setting for condition 2.
     * @param abs           The ABS setting.
     * @param eCUMap        The ECU map setting.
     * @param fuelMix       The fuel mix setting.
     * @param telemetryLaps The number of laps for telemetry data recording.
     */
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

    /**
     * Gets the traction control setting for condition 1 of this Electronics
     * configuration.
     *
     * @return The traction control setting for condition 1.
     */
    public long gettC1() {
        return tC1;
    }

    /**
     * Gets the traction control setting for condition 2 of this Electronics
     * configuration.
     *
     * @return The traction control setting for condition 2.
     */
    public long gettC2() {
        return tC2;
    }

    /**
     * Gets the ABS setting of this Electronics configuration.
     *
     * @return The ABS setting.
     */
    public long getAbs() {
        return abs;
    }

    /**
     * Gets the ECU map setting of this Electronics configuration.
     *
     * @return The ECU map setting.
     */
    public long geteCUMap() {
        return eCUMap;
    }

    /**
     * Gets the fuel mix setting of this Electronics configuration.
     *
     * @return The fuel mix setting.
     */
    public long getFuelMix() {
        return fuelMix;
    }

    /**
     * Gets the number of laps for telemetry data recording of this Electronics
     * configuration.
     *
     * @return The number of telemetry laps.
     */
    public long getTelemetryLaps() {
        return telemetryLaps;
    }
}
