package com.mycompany.jsonfilereader;

//creating the setup class
public class Setup {

    //declaring carName and basicSetup and the advancedSetup
    String carName;
    BasicSetup basicSetup;
    AdvancedSetup advancedSetup;

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
    }

    //get's car name 
    public String getCarName() {
        return carName;
    }
    //get's the data from basicSetup
    public BasicSetup getBasicSetup() {
        return basicSetup;
    }
    //get's the data from advancedSetup
    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }
}
