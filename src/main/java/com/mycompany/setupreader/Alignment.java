package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class Alignment {

    List camber = new ArrayList();
    List toe = new ArrayList();
    List staticCamber = new ArrayList();
    List toeOutLinear = new ArrayList();
    long casterLF;
    long casterRF;
    long steerRatio;

    public Alignment(List camber, List toe, List staticCamber, List toeOutLinear, long casterLF, long casterRF, long steerRatio) {

        this.camber = camber;
        this.toe = toe;
        this.staticCamber = staticCamber;
        this.toeOutLinear = toeOutLinear;
        this.casterLF = casterLF;
        this.casterRF = casterRF;
        this.steerRatio = steerRatio;
    }

    //making getters
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
