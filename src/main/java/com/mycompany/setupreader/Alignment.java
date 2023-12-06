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

    public Alignment(List camber, List toe, List staticCamber, List toeOutLinear, long casterLF, long casterRF,
            long steerRatio) {

        this.camber = camber;
        this.toe = toe;
        this.staticCamber = staticCamber;
        this.toeOutLinear = toeOutLinear;
        this.casterLF = casterLF;
        this.casterRF = casterRF;
        this.steerRatio = steerRatio;
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
