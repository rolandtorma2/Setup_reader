package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

/**
 * The MechanicalBalance class represents the mechanical balance configuration of a vehicle,
 * including settings for wheel rate, bump stop rates (up and down), bump stop window,
 * anti-roll bar rates (front and rear), brake torque, and brake bias.
 */
public class MechanicalBalance {

    // Variables to store mechanical balance information
    List wheelRate = new ArrayList();
    List bumpStopRateUp = new ArrayList();
    List bumpStopRateDn = new ArrayList();
    List bumpStopWindow = new ArrayList();
    long aRBFront;
    long aRBRear;
    long brakeTorque;
    long brakeBias;

    /**
     * Constructs a MechanicalBalance instance with specified mechanical balance configuration parameters.
     *
     * @param wheelRate The list of wheel rates for each corner.
     * @param bumpStopRateUp The list of bump stop rates (up) for each corner.
     * @param bumpStopRateDn The list of bump stop rates (down) for each corner.
     * @param bumpStopWindow The list of bump stop windows for each corner.
     * @param aRBFront The anti-roll bar rate for the front.
     * @param aRBRear The anti-roll bar rate for the rear.
     * @param brakeTorque The brake torque setting.
     * @param brakeBias The brake bias setting.
     */
    public MechanicalBalance(List wheelRate, List bumpStopRateUp, List bumpStopRateDn, List bumpStopWindow,
                             long aRBFront, long aRBRear, long brakeTorque, long brakeBias) {
        this.aRBFront = aRBFront;
        this.aRBRear = aRBRear;
        this.brakeTorque = brakeTorque;
        this.brakeBias = brakeBias;
        this.wheelRate = wheelRate;
        this.bumpStopRateUp = bumpStopRateUp;
        this.bumpStopRateDn = bumpStopRateDn;
        this.bumpStopWindow = bumpStopWindow;
    }

    /**
     * Gets the list of wheel rates for each corner in this MechanicalBalance configuration.
     *
     * @return The list of wheel rates.
     */
    public List getWheelRate() {
        return wheelRate;
    }

    /**
     * Gets the list of bump stop rates (up) for each corner in this MechanicalBalance configuration.
     *
     * @return The list of bump stop rates (up).
     */
    public List getBumpStopRateUp() {
        return bumpStopRateUp;
    }

    /**
     * Gets the list of bump stop rates (down) for each corner in this MechanicalBalance configuration.
     *
     * @return The list of bump stop rates (down).
     */
    public List getBumpStopRateDn() {
        return bumpStopRateDn;
    }

    /**
     * Gets the list of bump stop windows for each corner in this MechanicalBalance configuration.
     *
     * @return The list of bump stop windows.
     */
    public List getBumpStopWindow() {
        return bumpStopWindow;
    }

    /**
     * Gets the anti-roll bar rate for the front in this MechanicalBalance configuration.
     *
     * @return The anti-roll bar rate for the front.
     */
    public long getaRBFront() {
        return aRBFront;
    }

    /**
     * Gets the anti-roll bar rate for the rear in this MechanicalBalance configuration.
     *
     * @return The anti-roll bar rate for the rear.
     */
    public long getaRBRear() {
        return aRBRear;
    }

    /**
     * Gets the brake torque setting in this MechanicalBalance configuration.
     *
     * @return The brake torque setting.
     */
    public long getBrakeTorque() {
        return brakeTorque;
    }

    /**
     * Gets the brake bias setting in this MechanicalBalance configuration.
     *
     * @return The brake bias setting.
     */
    public long getBrakeBias() {
        return brakeBias;
    }
}
