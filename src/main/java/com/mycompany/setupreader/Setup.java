package com.mycompany.setupreader;

public class Setup {

    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;
    long trackBopType;

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup, long trackBopType) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
        this.trackBopType = trackBopType;
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
