package com.mycompany.jsonfilereader;

import java.util.List;

public class Tyres {

    int tyreCompound;
    List tyrePressure;

    public Tyres(int tyreCompound, List tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure = tyrePressure;
    }

    public int getTyreCompound() {
        return tyreCompound;
    }

    public List getTyrePressure() {
        return tyrePressure;
    }
}
