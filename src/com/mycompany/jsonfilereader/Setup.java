package com.mycompany.jsonfilereader;

public class Setup {

    String carName;
    BasicSetup basicSetup;

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

}
