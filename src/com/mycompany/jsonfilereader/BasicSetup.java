package com.mycompany.jsonfilereader;

public class BasicSetup {

    Tyres tyres;
    Alignment alignment;
    Electronics electronics;
    Strategy strategy;

    public BasicSetup(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public BasicSetup(Alignment alignment) {
        this.alignment = alignment;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public BasicSetup(Electronics electronics) {
        this.electronics = electronics;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public BasicSetup(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

}
