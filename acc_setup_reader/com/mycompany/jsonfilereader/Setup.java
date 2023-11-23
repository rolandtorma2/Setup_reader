package com.mycompany.jsonfilereader;

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

<<<<<<< Updated upstream:src/com/mycompany/jsonfilereader/Setup.java
=======
    //get's the data from basicSetup
>>>>>>> Stashed changes:acc_setup_reader/com/mycompany/jsonfilereader/Setup.java
    public BasicSetup getBasicSetup() {
        return basicSetup;
    }

<<<<<<< Updated upstream:src/com/mycompany/jsonfilereader/Setup.java
=======
    public AdvancedSetup getAdvancedSetup() {
        return advancedSetup;
    }

>>>>>>> Stashed changes:acc_setup_reader/com/mycompany/jsonfilereader/Setup.java
}
