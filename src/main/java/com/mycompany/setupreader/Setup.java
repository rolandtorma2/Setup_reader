package com.mycompany.setupreader;

/**
 * The Setup class represents the overall setup configuration for a vehicle,
 * including the car name, basic setup, and advanced setup.
 */
public class Setup {

    // Variables to store setup information
    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;

    /**
     * Constructs a Setup instance with specified setup configuration parameters.
     *
     * @param carName The name of the car.
     * @param basicSetup The basic setup configuration.
     * @param advancedSetup The advanced setup configuration.
     */
    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
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
