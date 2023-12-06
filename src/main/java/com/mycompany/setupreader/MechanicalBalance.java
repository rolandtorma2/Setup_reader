package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

/**
 * The MechanicalBalance class represents the mechanical balance configuration
 * of a vehicle,
 * including settings for wheel rate, bump stop rates (up and down), bump stop
 * window,
 * anti-roll bar rates (front and rear), brake torque, and brake bias.
 */
public class MechanicalBalance {

    List wheelRate = new ArrayList();
    List bumpStopRateUp = new ArrayList();
    List bumpStopRateDn = new ArrayList();
    List bumpStopWindow = new ArrayList();
    long aRBFront;
    long aRBRear;
    long brakeTorque;
    long brakeBias;

    public void printValues() {

        System.out.println("ARB Data: ");
        System.out.println("ARB Front: " + this.aRBFront);
        System.out.println("ARB Rear: " + this.aRBRear + "\n");

        System.out.println("Wheelrate data: ");
        System.out.println("Wheelrate: Front left: " + wheelRate.get(Utils.WHEELRATE_FRONT_LEFT));
        System.out.println("Wheelrate: Front right: " + wheelRate.get(Utils.WHEELRATE_FRONT_RIGHT));
        System.out.println("Wheelrate: Rear left: " + wheelRate.get(Utils.WHEELRATE_REAR_LEFT));
        System.out.println("Wheelrate: Rear right: " + wheelRate.get(Utils.WHEELRATE_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop Rateup data: ");
        System.out.println("Bumpstop Rateup: Front Left: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_FRONT_LEFT));
        System.out.println("Bumpstop Rateup: Front Right: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_FRONT_RIGHT));
        System.out.println("Bumpstop Rateup: Rear Left: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_REAR_LEFT));
        System.out.println("Bumpstop Rateup: Rear Right: " + bumpStopRateUp.get(Utils.BUMP_RATE_UP_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop Ratedown data: ");
        System.out.println("Bumpstop Ratedown: Front Left: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_FRONT_LEFT));
        System.out.println("Bumpstop Ratedown: Front Right: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_FRONT_RIGHT));
        System.out.println("Bumpstop Ratedown: Rear Left: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_REAR_LEFT));
        System.out.println(
                "Bumpstop Ratedown: Rear Right: " + bumpStopRateDn.get(Utils.BUMP_RATE_DOWN_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop window data: ");
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_FRONT_LEFT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_FRONT_RIGHT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_REAR_LEFT));
        System.out.println("Bumpstop window: Front left: " + bumpStopWindow.get(Utils.BUMP_WINDOW_REAR_RIGHT) + "\n");

        System.out.println("Brake data: ");
        System.out.println("Braketorque: " + this.brakeTorque);
        System.out.println("Brake Bias: " + this.brakeBias + "\n");
    }

    /**
     * Constructs a MechanicalBalance instance with specified mechanical balance
     * configuration parameters.
     *
     * @param wheelRate      The list of wheel rates for each corner.
     * @param bumpStopRateUp The list of bump stop rates (up) for each corner.
     * @param bumpStopRateDn The list of bump stop rates (down) for each corner.
     * @param bumpStopWindow The list of bump stop windows for each corner.
     * @param aRBFront       The anti-roll bar rate for the front.
     * @param aRBRear        The anti-roll bar rate for the rear.
     * @param brakeTorque    The brake torque setting.
     * @param brakeBias      The brake bias setting.
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
        printValues();
    }

    /**
     * Gets the list of wheel rates for each corner in this MechanicalBalance
     * configuration.
     *
     * @return The list of wheel rates.
     */
    public List getWheelRate() {
        return wheelRate;
    }

    /**
     * Gets the list of bump stop rates (up) for each corner in this
     * MechanicalBalance configuration.
     *
     * @return The list of bump stop rates (up).
     */
    public List getBumpStopRateUp() {
        return bumpStopRateUp;
    }

    /**
     * Gets the list of bump stop rates (down) for each corner in this
     * MechanicalBalance configuration.
     *
     * @return The list of bump stop rates (down).
     */
    public List getBumpStopRateDn() {
        return bumpStopRateDn;
    }

    /**
     * Gets the list of bump stop windows for each corner in this MechanicalBalance
     * configuration.
     *
     * @return The list of bump stop windows.
     */
    public List getBumpStopWindow() {
        return bumpStopWindow;
    }

    /**
     * Gets the anti-roll bar rate for the front in this MechanicalBalance
     * configuration.
     *
     * @return The anti-roll bar rate for the front.
     */
    public long getaRBFront() {
        return aRBFront;
    }

    /**
     * Gets the anti-roll bar rate for the rear in this MechanicalBalance
     * configuration.
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
