package com.mycompany.setupreader;

public class AdvancedSetup {
    MechanicalBalance mechanicalBalance;
    Dampers dampers;
    AeroBalance aeroBalance;
    DriveTrain drivetrain;

    public AdvancedSetup(MechanicalBalance mechanicalBalance, Dampers dampers, AeroBalance aeroBalance, DriveTrain driveTrain) {
        this.mechanicalBalance = mechanicalBalance;
        this.dampers = dampers;
        this.aeroBalance = aeroBalance;
        this.drivetrain = driveTrain;
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
