package com.mycompany.setupreader;

//creating the setup class
public class Setup {

    // declaring carName and basicSetup
    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
    }

    // making getters
    public String getCarName() {
        return carName;
    }

    //get's the data from basicSetup
    public BasicSetup getBasicSetup() {
        return basicSetup;
    }

    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }

}
