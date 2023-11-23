package com.mycompany.jsonfilereader;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;

public class Tyres {

    int tyreCompound;
    List tyrePressure = new ArrayList();


    public Tyres(int tyreCompound, List tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure = tyrePressure;
    }

    public Tyres(int tyreCompound, JSONArray tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure.addAll(tyrePressure);

    }

    //making getters
    public int getTyreCompound() {
        return tyreCompound;
    }

    public List getTyrePressure() {
        return tyrePressure;
    }
}
