package com.mycompany.jsonfilereader;


//creating the setup class
public class Setup {

    //declaring carName and basicSetup
    String carName;
    BasicSetup basicSetup;

    public Setup(String carName, BasicSetup basicSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
    }
    //making getters
    public String getCarName() {
        return carName;
    }

    public BasicSetup getBasicSetup() {
        return basicSetup;
    }

}
