package com.mycompany.setupreader;

public class Setup {

    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;
    long trackBopType;

    public void printValues() {
        System.out.println("Car name: " + this.carName);
        System.out.println("TrackBOPType: " + this.trackBopType);
    }

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup, long trackBopType) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
        this.trackBopType = trackBopType;
        printValues();
    }

    public String getCarName() {
        return carName;
    }

    public BasicSetup getBasicSetup() {
        return basicSetup;
    }

    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }
}
