package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class Dampers {

    List bumpSlow = new ArrayList();
    List bumpFast = new ArrayList();
    List reboundSlow = new ArrayList();
    List reboundFast = new ArrayList();


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

    public List getBumpSlow() {
        return bumpSlow;
    }

    public List getBumpFast() {
        return bumpFast;
    }

    public List getReboundSlow() {
        return reboundSlow;
    }

    public List getReboundFast() {
        return reboundFast;
    }
}
