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

    public void printAlignmentValues() {
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
