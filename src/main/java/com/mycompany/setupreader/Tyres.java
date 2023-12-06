package com.mycompany.setupreader;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;

//creating the tyres class
public class Tyres {

    int tyreCompound;
    List tyrePressure = new ArrayList();

    public void printValues() {
        System.out.println("Tyre Compound : " + this.tyreCompound);
        System.out.println("Tyre Pressures : ");
        System.out.println("Front Left Tyre : " + this.tyrePressure.get(Utils.FRONT_LEFT) + " psi");
        System.out.println("Front Right Tyre : " + this.tyrePressure.get(Utils.FRONT_RIGHT) + " psi");
        System.out.println("Rear Left Tyre : " + this.tyrePressure.get(Utils.REAR_LEFT) + " psi");
        System.out.println("Rear Right Tyre : " + this.tyrePressure.get(Utils.REAR_RIGHT) + " psi\n");
    }

    public Tyres(int tyreCompound, JSONArray tyrePressure) {
        this.tyreCompound = tyreCompound;
        this.tyrePressure.addAll(tyrePressure);
        printValues();

    }

    // making getters
    public int getTyreCompound() {
        return tyreCompound;
    }

    public List getTyrePressure() {
        return tyrePressure;
    }
}
