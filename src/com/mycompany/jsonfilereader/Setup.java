package com.mycompany.jsonfilereader;

public class Setup {

    String carName;
    BasicSetup basicSetup;
<<<<<<< Updated upstream

    public Setup(String carName, BasicSetup basicSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
=======
    AdvancedSetup advancedSetup;

    public Setup(String carName, BasicSetup basicSetup, AdvancedSetup advancedSetup) {
        this.carName = carName;
        this.basicSetup = basicSetup;
        this.advancedSetup = advancedSetup;
>>>>>>> Stashed changes
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
    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }

>>>>>>> Stashed changes
}
