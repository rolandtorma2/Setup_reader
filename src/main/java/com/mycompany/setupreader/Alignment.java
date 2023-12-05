package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

    /**
     * The Alignment class represents the alignment configuration for a car setup,
     * including parameters such as camber, toe, static camber, toe out linear, caster, and steer ratio.
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

    public List getToe() {
        return toe;
    }

    public List getStaticCamber() {
        return staticCamber;
    }

    public List getToeOutLinear() {
        return toeOutLinear;
    }

    public long getCasterLF() {
        return casterLF;
    }

    public long getCasterRF() {
        return casterRF;
    }

    public long getSteerRatio() {
        return steerRatio;
    }
}
