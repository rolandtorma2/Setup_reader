package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;

public class Dampers {

    List bumpSlow = new ArrayList();
    List bumpFast = new ArrayList();
    List reboundSlow = new ArrayList();
    List reboundFast = new ArrayList();

    public Dampers(List bumpSlow, List bumpFast, List reboundSlow, List reboundFast) {
        this.bumpSlow = bumpSlow;
        this.bumpFast = bumpFast;
        this.reboundSlow = reboundSlow;
        this.reboundFast = reboundFast;
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