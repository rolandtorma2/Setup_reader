package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

/**
 * The Dampers class represents the damper configuration of a vehicle,
 * including settings for bump slow, bump fast, rebound slow, and rebound fast.
 */
public class Dampers {

    List bumpSlow = new ArrayList();
    List bumpFast = new ArrayList();
    List reboundSlow = new ArrayList();
    List reboundFast = new ArrayList();

    /**
     * Constructs a Dampers instance with specified damper configuration parameters.
     *
     * @param bumpSlow    The list of bump slow settings.
     * @param bumpFast    The list of bump fast settings.
     * @param reboundSlow The list of rebound slow settings.
     * @param reboundFast The list of rebound fast settings.
     */

    public void printValues() {
        System.out.println("Bumpstop slow front left: " + this.bumpSlow.get(Utils.BUMP_SLOW_FRONT_LEFT));
        System.out.println("Bumpstop slow front right: " + this.bumpSlow.get(Utils.BUMP_SLOW_FRONT_RIGHT));
        System.out.println("Bumpstop slow rear left: " + this.bumpSlow.get(Utils.BUMP_FAST_REAR_LEFT));
        System.out.println("Bumpstop slow rear right: " + this.bumpSlow.get(Utils.BUMP_FAST_REAR_RIGHT) + "\n");

        System.out.println("Bumpstop fast data: \n");
        System.out.println("Bumpstop fast front left: " + this.bumpFast.get(Utils.BUMP_FAST_FRONT_LEFT));
        System.out.println("Bumpstop fast front left: " + this.bumpFast.get(Utils.BUMP_FAST_FRONT_RIGHT));
        System.out.println("Bumpstop fast front left: " + this.bumpFast.get(Utils.BUMP_FAST_REAR_LEFT));
        System.out.println("Bumpstop fast front left: " + this.bumpFast.get(Utils.BUMP_FAST_REAR_RIGHT) + "\n");

        System.out.println("Rebound slow data: \n");
        System.out.println("Rebound slow front left: " + this.reboundSlow.get(Utils.REBOUND_SLOW_FRONT_LEFT));
        System.out.println("Rebound slow front left: " + this.reboundSlow.get(Utils.REBOUND_SLOW_FRONT_RIGHT));
        System.out.println("Rebound slow front left: " + this.reboundSlow.get(Utils.REBOUND_SLOW_REAR_LEFT));
        System.out.println("Rebound slow front left: " + this.reboundSlow.get(Utils.REBOUND_SLOW_REAR_RIGHT) + "\n");

        System.out.println("Rebound fast data: \n");
        System.out.println("Rebound fast front left: " + this.reboundFast.get(Utils.REBOUND_FAST_FRONT_LEFT));
        System.out.println("Rebound fast front left: " + this.reboundFast.get(Utils.REBOUND_FAST_FRONT_RIGHT));
        System.out.println("Rebound fast front left: " + this.reboundFast.get(Utils.REBOUND_FAST_REAR_LEFT));
        System.out.println("Rebound fast front left: " + this.reboundFast.get(Utils.REBOUND_FAST_REAR_RIGHT) + "\n");
    }

    public Dampers(List bumpSlow, List bumpFast, List reboundSlow, List reboundFast) {
        this.bumpSlow = bumpSlow;
        this.bumpFast = bumpFast;
        this.reboundSlow = reboundSlow;
        this.reboundFast = reboundFast;
        printValues();
    }

    /**
     * Gets the list of bump slow settings of this Dampers configuration.
     *
     * @return The list of bump slow settings.
     */
    public List getBumpSlow() {
        return bumpSlow;
    }

    /**
     * Gets the list of bump fast settings of this Dampers configuration.
     *
     * @return The list of bump fast settings.
     */
    public List getBumpFast() {
        return bumpFast;
    }

    /**
     * Gets the list of rebound slow settings of this Dampers configuration.
     *
     * @return The list of rebound slow settings.
     */
    public List getReboundSlow() {
        return reboundSlow;
    }

    /**
     * Gets the list of rebound fast settings of this Dampers configuration.
     *
     * @return The list of rebound fast settings.
     */
    public List getReboundFast() {
        return reboundFast;
    }
}
