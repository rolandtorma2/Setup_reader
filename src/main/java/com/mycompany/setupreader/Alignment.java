package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

/**
 * The Alignment class represents the alignment configuration of a vehicle,
 * including camber, toe, static camber, toe-out linear, caster for left and
 * right front wheels,
 * and the steering ratio setting.
 */
public class Alignment {

    List camber = new ArrayList();
    List toe = new ArrayList();
    List staticCamber = new ArrayList();
    List toeOutLinear = new ArrayList();
    long casterLF;
    long casterRF;
    long steerRatio;

    /**
     * Constructs a new Alignment object with the specified parameters.
     *
     * @param camber       List of camber values for different wheels.
     * @param toe          List of toe values for different wheels.
     * @param staticCamber List of static camber values for different wheels.
     * @param toeOutLinear List of toe out linear values for different wheels.
     * @param casterLF     The caster value for the left front wheel.
     * @param casterRF     The caster value for the right front wheel.
     * @param steerRatio   The steering ratio of the car.
     */
    public void printValues() {
        System.out.println("Front left camber : " + this.camber.get(Utils.CAMBER_FRONT_LEFT) + "%");
        System.out.println("Front right camber : " + this.camber.get(Utils.CAMBER_FRONT_RIGHT) + "%");
        System.out.println("Rear left camber : " + this.camber.get(Utils.CAMBER_REAR_LEFT) + "%");
        System.out.println("Rear right camber : " + this.camber.get(Utils.CAMBER_REAR_RIGHT) + "%\n");

        System.out.println("Front left toe : " + this.toe.get(Utils.TOE_FRONT_LEFT));
        System.out.println("Front right toe : " + this.toe.get(Utils.TOE_FRONT_RIGHT));
        System.out.println("Rear left toe : " + this.toe.get(Utils.TOE_REAR_LEFT));
        System.out.println("Rear right toe : " + this.toe.get(Utils.TOE_REAR_RIGHT) + "\n");

        System.out.println("Front left static camber : "
                + this.staticCamber.get(Utils.STATIC_CAMBER_FRONT_LEFT) + " degrees");
        System.out.println("Front right static camber : "
                + this.staticCamber.get(Utils.STATIC_CAMBER_FRONT_RIGHT) + " degrees");
        System.out.println("Rear left static camber : " + this.staticCamber.get(Utils.STATIC_CAMBER_REAR_LEFT)
                + " degrees");
        System.out.println("Rear right static camber : "
                + this.staticCamber.get(Utils.STATIC_CAMBER_REAR_RIGHT) + " degrees\n");

        System.out.println(
                "Front left toe out linear : " + this.toeOutLinear.get(Utils.TOE_OUT_LINEAR_FRONT_LEFT));
        System.out.println(
                "Front right toe out linear : " + this.toeOutLinear.get(Utils.TOE_OUT_LINEAR_FRONT_RIGHT));
        System.out.println(
                "Rear left toe out linear : " + this.toeOutLinear.get(Utils.TOE_OUT_LINEAR_REAR_LEFT));
        System.out.println("Rear right toe out linear : "
                + this.toeOutLinear.get(Utils.TOE_OUT_LINEAR_REAR_RIGHT) + "\n");

        System.out.println("Left Front Caster : " + this.casterLF);
        System.out.println("Right Front Caster : " + this.casterRF);
        System.out.println("Steering ratio : " + this.steerRatio + "\n");

    }

    public Alignment(List camber, List toe, List staticCamber, List toeOutLinear, long casterLF, long casterRF,
            long steerRatio) {

        this.camber = camber;
        this.toe = toe;
        this.staticCamber = staticCamber;
        this.toeOutLinear = toeOutLinear;
        this.casterLF = casterLF;
        this.casterRF = casterRF;
        this.steerRatio = steerRatio;
        printValues();
    }

    public List getCamber() {
        return camber;
    }

    /**
     * Gets the list of toe settings of this Alignment configuration.
     *
     * @return The list of toe settings.
     */
    public List getToe() {
        return toe;
    }

    /**
     * Gets the list of static camber settings of this Alignment configuration.
     *
     * @return The list of static camber settings.
     */
    public List getStaticCamber() {
        return staticCamber;
    }

    /**
     * Gets the list of toe-out linear settings of this Alignment configuration.
     *
     * @return The list of toe-out linear settings.
     */
    public List getToeOutLinear() {
        return toeOutLinear;
    }

    /**
     * Gets the caster setting for the left front wheel of this Alignment
     * configuration.
     *
     * @return The caster setting for the left front wheel.
     */
    public long getCasterLF() {
        return casterLF;
    }

    /**
     * Gets the caster setting for the right front wheel of this Alignment
     * configuration.
     *
     * @return The caster setting for the right front wheel.
     */
    public long getCasterRF() {
        return casterRF;
    }

    /**
     * Gets the steering ratio setting of this Alignment configuration.
     *
     * @return The steering ratio setting.
     */
    public long getSteerRatio() {
        return steerRatio;
    }
}
