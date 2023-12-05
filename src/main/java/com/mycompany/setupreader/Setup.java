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

    public Setup(String carName, BasicSetup basicSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
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
