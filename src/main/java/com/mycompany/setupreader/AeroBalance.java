package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

/**
 * The AeroBalance class represents the aerodynamic balance configuration of a vehicle,
 * including ride height, rod length, brake ducts, splitter, and rear wing settings.
 */
public class AeroBalance {

    List rideHeight = new ArrayList();
    List rodLength = new ArrayList();
    List brakeDuct = new ArrayList();
    long splitter;
    long rearWing;

    /**
     * Constructs an AeroBalance instance with specified aerodynamic configuration parameters.
     *
     * @param rideHeight The list of ride height settings.
     * @param rodLength The list of rod length settings.
     * @param brakeDuct The list of brake duct settings.
     * @param splitter The splitter setting.
     * @param rearWing The rear wing setting.
     */
    public AeroBalance(List rideHeight, List rodLength, List brakeDuct, long splitter, long rearWing) {
        this.rideHeight = rideHeight;
        this.rodLength = rodLength;
        this.brakeDuct = brakeDuct;
        this.splitter = splitter;
        this.rearWing = rearWing;
    }

    /**
     * Gets the list of ride height settings of this AeroBalance configuration.
     *
     * @return The list of ride height settings.
     */
    public List getRideHeight() {
        return rideHeight;
    }

    /**
     * Gets the list of rod length settings of this AeroBalance configuration.
     *
     * @return The list of rod length settings.
     */
    public List getRodLength() {
        return rodLength;
    }

    /**
     * Gets the list of brake duct settings of this AeroBalance configuration.
     *
     * @return The list of brake duct settings.
     */
    public List getBrakeDuct() {
        return brakeDuct;
    }

    /**
     * Gets the splitter setting of this AeroBalance configuration.
     *
     * @return The splitter setting.
     */
    public long getSplitter() {
        return splitter;
    }

    /**
     * Gets the rear wing setting of this AeroBalance configuration.
     *
     * @return The rear wing setting.
     */
    public long getRearWing() {
        return rearWing;
    }
}
