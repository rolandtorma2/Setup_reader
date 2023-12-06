package com.mycompany.setupreader;

/**
 * The BasicSetup class represents a basic configuration setup for a vehicle,
 * including settings for tyres, alignment, electronics, and strategy.
 */
public class BasicSetup {

    Tyres tyres;
    Alignment alignment;
    Electronics electronics;
    Strategy strategy;

    /**
     * Constructs a BasicSetup instance with specified tyre configuration.
     *
     * @param tyres The tyre configuration.
     */
    public BasicSetup(Tyres tyres, Alignment alignment, Electronics electronics, Strategy strategy) {
        this.tyres = tyres;
        this.alignment = alignment;
        this.electronics = electronics;
        this.strategy = strategy;
    }

    /**
     * Gets the tyre configuration of this BasicSetup.
     *
     * @return The tyre configuration.
     */
    public Tyres getTyres() {
        return tyres;
    }

    /**
     * Constructs a BasicSetup instance with specified alignment configuration.
     *
     * @param alignment The alignment configuration.
     */
    public BasicSetup(Alignment alignment) {
        this.alignment = alignment;
    }

    /**
     * Gets the alignment configuration of this BasicSetup.
     *
     * @return The alignment configuration.
     */
    public Alignment getAlignment() {
        return alignment;
    }

    /**
     * Constructs a BasicSetup instance with specified electronics configuration.
     *
     * @param electronics The electronics configuration.
     */
    public BasicSetup(Electronics electronics) {
        this.electronics = electronics;
    }

    /**
     * Gets the electronics configuration of this BasicSetup.
     *
     * @return The electronics configuration.
     */
    public Electronics getElectronics() {
        return electronics;
    }

    /**
     * Constructs a BasicSetup instance with specified strategy configuration.
     *
     * @param strategy The strategy configuration.
     */
    public BasicSetup(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Gets the strategy configuration of this BasicSetup.
     *
     * @return The strategy configuration.
     */
    public Strategy getStrategy() {
        return strategy;
    }
}
