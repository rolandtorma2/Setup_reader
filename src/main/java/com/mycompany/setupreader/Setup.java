package com.mycompany.setupreader;

public class Setup {

    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
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
