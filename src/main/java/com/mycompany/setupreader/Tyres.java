package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;

/**
 * The Tyres class represents the tire configuration of a vehicle,
 * including the tyre compound and a list of tyre pressure settings.
 */
public class Tyres {

    // Variables to store tyre information
    int tyreCompound;
    List tyrePressure = new ArrayList();

    /**
     * Constructs a Tyres instance with specified tyre configuration parameters.
     *
     * @param tyreCompound The tyre compound setting.
     * @param tyrePressure The list of tyre pressure settings.
     */
    public Tyres(int tyreCompound, JSONArray tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure.addAll(tyrePressure);
    }

    /**
     * Gets the tyre compound setting of this Tyres configuration.
     *
     * @return The tyre compound setting.
     */
    public int getTyreCompound() {
        return tyreCompound;
    }

    /**
     * Gets the list of tyre pressure settings of this Tyres configuration.
     *
     * @return The list of tyre pressure settings.
     */
    public List getTyrePressure() {
        return tyrePressure;
    }
}
