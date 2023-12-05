package com.mycompany.setupreader;

public class AdvancedSetup {

    MechanicalBalance mechanicalBalance;
    Dampers dampers;
    AeroBalance aeroBalance;
    DriveTrain drivetrain;

    public AdvancedSetup(MechanicalBalance mechanicalBalance) {
        this.mechanicalBalance = mechanicalBalance;
    }

    public MechanicalBalance getMechanicalBalance() {
        return mechanicalBalance;
    }

    public AdvancedSetup(Dampers dampers) {
        this.dampers = dampers;
    }

    public Dampers getDampers() {
        return dampers;
    }

    public AdvancedSetup(AeroBalance aeroBalance) {
        this.aeroBalance = aeroBalance;
    }

    public AeroBalance getAeroBalance() {
        return aeroBalance;
    }

    public AdvancedSetup(DriveTrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    public DriveTrain getDrivetrain() {
        return drivetrain;
    }

}
