package com.mycompany.setupreader;

/**
 * The BasicSetup class represents the comprehensive configuration for a car setup,
 * including information about tires (Tyres), alignment settings (Alignment),
 * electronics configuration (Electronics), and strategic settings (Strategy).
 */
public class BasicSetup {

    /**
     * The Tyres configuration for the car setup.
     */
    Tyres tyres;

    /**
     * The Alignment settings for the car setup.
     */
    Alignment alignment;

    /**
     * The Electronics configuration for the car setup.
     */
    Electronics electronics;

    /**
     * The Strategy settings for the car setup.
     */
    Strategy strategy;

    /**
     * Constructs a new BasicSetup object with Tyres configuration.
     *
     * @param tyres The Tyres configuration for the car setup.
     */
    public BasicSetup(Tyres tyres) {
        this.tyres = tyres;
    }

    /**
     * Gets the Tyres configuration for the car setup.
     *
     * @return The Tyres configuration.
     */
    public Tyres getTyres() {
        return tyres;
    }

    /**
     * Constructs a new BasicSetup object with Alignment settings.
     *
     * @param alignment The Alignment settings for the car setup.
     */
    public BasicSetup(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * Gets the Alignment settings for the car setup.
     *
     * @return The Alignment settings.
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Constructs a new BasicSetup object with Electronics configuration.
     *
     * @param electronics The Electronics configuration for the car setup.
     */
    public BasicSetup(Electronics electronics) {
        this.electronics = electronics;
    }

    /**
     * Gets the Electronics configuration for the car setup.
     *
     * @return The Electronics configuration.
     */
    public Electronics getElectronics() {
        return electronics;
    }

    /**
     * Constructs a new BasicSetup object with Strategy settings.
     *
     * @param strategy The Strategy settings for the car setup.
     */
    public BasicSetup(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Gets the Strategy settings for the car setup.
     *
     * @return The Strategy settings.
     */
    public Strategy getStrategy() {
        return strategy;
    }
}
