package com.mycompany.jsonfilereader;

<<<<<<< Updated upstream
import java.util.List;
=======
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
>>>>>>> Stashed changes

public class Tyres {

    int tyreCompound;
<<<<<<< Updated upstream
    List tyrePressure;
=======
    List tyrePressure = new ArrayList();

>>>>>>> Stashed changes

    public Tyres(int tyreCompound, List tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure = tyrePressure;
    }

<<<<<<< Updated upstream
=======
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
