package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;

    /**
     * The Tyres class represents the configuration for a car's tires,
     * including the compound type and pressure settings for each tire.
     */

public class Tyres {

    int tyreCompound;
    List tyrePressure = new ArrayList();

    /**
     * Constructs a new Tyres object with the specified parameters.
     *
     * @param tyreCompound  The type of tire compound selected for the car.
     * @param tyrePressure  List of tire pressure values for different tires.
     */

    public Tyres(int tyreCompound, JSONArray tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure.addAll(tyrePressure);

    }

    // making getters
    public int getTyreCompound() {
        return tyreCompound;
    }

    public List getTyrePressure() {
        return tyrePressure;
    }
}
