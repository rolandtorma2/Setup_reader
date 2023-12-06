package com.mycompany.setupreader;

/**
 * The Setup class represents the overall setup configuration for a vehicle,
 * including the car name, basic setup, and advanced setup.
 */
public class Setup {

    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;
    long trackBopType;

    /**
     * Constructs a Setup instance with specified setup configuration parameters.
     *
     * @param carName       The name of the car.
     * @param basicSetup    The basic setup configuration.
     * @param advancedSetup The advanced setup configuration.
     */
    public void printValues() {
        System.out.println("Car name: " + this.carName);
        System.out.println("TrackBOPType: " + this.trackBopType);
    }

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup, long trackBopType) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
        this.trackBopType = trackBopType;
        printValues();
    }

    /**
     * Gets the name of the car in this Setup configuration.
     *
     * @return The name of the car.
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Gets the basic setup configuration in this Setup.
     *
     * @return The basic setup configuration.
     */
    public BasicSetup getBasicSetup() {
        return basicSetup;
    }

    /**
     * Gets the advanced setup configuration in this Setup.
     *
     * @return The advanced setup configuration.
     */
    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }
}
