package com.mycompany.setupreader;

/**
 * The Setup class represents the setup configuration for a car, including the car name and basic setup information.
 */
public class Setup {

    /**
     * The name of the car.
     */
    String carName;

    /**
     * The basic setup information for the car.
     */
    BasicSetup basicSetup;

    /**
     * Constructs a new Setup object with the specified car name and basic setup information.
     *
     * @param carName     The name of the car.
     * @param basicSetup  The basic setup information for the car.
     */
    public Setup(String carName, BasicSetup basicSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
    }

    /**
     * Gets the name of the car.
     *
     * @return The name of the car.
     */
    public String getCarName() {
        return carName;
    }

    /**
     * Gets the basic setup information for the car.
     *
     * @return The basic setup information for the car.
     */
    public BasicSetup getBasicSetup() {
        return basicSetup;
    }
}
