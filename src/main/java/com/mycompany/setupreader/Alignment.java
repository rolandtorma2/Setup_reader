package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

/**
 * The Alignment class represents the alignment configuration of a vehicle,
 * including camber, toe, static camber, toe-out linear, caster for left and right front wheels,
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
     * Constructs an Alignment instance with specified alignment configuration parameters.
     *
     * @param camber The list of camber settings.
     * @param toe The list of toe settings.
     * @param staticCamber The list of static camber settings.
     * @param toeOutLinear The list of toe-out linear settings.
     * @param casterLF The caster setting for the left front wheel.
     * @param casterRF The caster setting for the right front wheel.
     * @param steerRatio The steering ratio setting.
     */
    public Alignment(List camber, List toe, List staticCamber, List toeOutLinear,
                     long casterLF, long casterRF, long steerRatio) {
        this.camber = camber;
        this.toe = toe;
        this.staticCamber = staticCamber;
        this.toeOutLinear = toeOutLinear;
        this.casterLF = casterLF;
        this.casterRF = casterRF;
        this.steerRatio = steerRatio;
    }

    /**
     * Gets the list of camber settings of this Alignment configuration.
     *
     * @return The list of camber settings.
     */
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
     * Gets the caster setting for the left front wheel of this Alignment configuration.
     *
     * @return The caster setting for the left front wheel.
     */
    public long getCasterLF() {
        return casterLF;
    }

    /**
     * Gets the caster setting for the right front wheel of this Alignment configuration.
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
