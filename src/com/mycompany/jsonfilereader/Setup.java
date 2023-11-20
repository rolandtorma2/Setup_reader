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

<<<<<<< Updated upstream
=======
    //get's the data from basicSetup
>>>>>>> Stashed changes
    public BasicSetup getBasicSetup() {
        return basicSetup;
    }

<<<<<<< Updated upstream
=======
    //get's the data from advancedSetup
    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }
>>>>>>> Stashed changes
}
