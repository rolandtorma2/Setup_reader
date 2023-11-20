package com.mycompany.jsonfilereader;

import java.util.List;

public class Tyres {

    int tyreCompound;
<<<<<<< Updated upstream
    List tyrePressure;

    public Tyres(int tyreCompound, List tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure = tyrePressure;
    }

=======
    List tyrePressure = new ArrayList();

    public Tyres(int tyreCompound, JSONArray tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure.addAll(tyrePressure);

    }

    //making getters
>>>>>>> Stashed changes
    public int getTyreCompound() {
        return tyreCompound;
    }

    public List getTyrePressure() {
        return tyrePressure;
    }
}
