package com.mycompany.setupreader;

/**
 * The AdvancedSetup class represents an advanced configuration setup for a
 * vehicle,
 * including mechanical balance, dampers, aero balance, and drivetrain settings.
 */

public class AdvancedSetup {

    MechanicalBalance mechanicalBalance;
    Dampers dampers;
    AeroBalance aeroBalance;
    DriveTrain drivetrain;

    /**
     * Constructs an AdvancedSetup instance with a specified MechanicalBalance.
     *
     * @param mechanicalBalance The MechanicalBalance configuration.
     */

    public AdvancedSetup(MechanicalBalance mechanicalBalance) {
        this.mechanicalBalance = mechanicalBalance;
    }

    /**
     * Gets the MechanicalBalance configuration of this AdvancedSetup.
     *
     * @return The MechanicalBalance configuration.
     */

    public MechanicalBalance getMechanicalBalance() {
        return mechanicalBalance;
    }

    /**
     * Constructs an AdvancedSetup instance with a specified Dampers configuration.
     *
     * @param dampers The Dampers configuration.
     */

    public AdvancedSetup(Dampers dampers) {
        this.dampers = dampers;
    }

    /**
     * Gets the Dampers configuration of this AdvancedSetup.
     *
     * @return The Dampers configuration.
     */

    public Dampers getDampers() {
        return dampers;
    }

    /**
     * Constructs an AdvancedSetup instance with a specified AeroBalance
     * configuration.
     *
     * @param aeroBalance The AeroBalance configuration.
     */

    public AdvancedSetup(AeroBalance aeroBalance) {
        this.aeroBalance = aeroBalance;
    }

    /**
     * Gets the AeroBalance configuration of this AdvancedSetup.
     *
     * @return The AeroBalance configuration.
     */

    public AeroBalance getAeroBalance() {
        return aeroBalance;
    }

    /**
     * Constructs an AdvancedSetup instance with a specified DriveTrain
     * configuration.
     *
     * @param drivetrain The DriveTrain configuration.
     */

    public AdvancedSetup(DriveTrain drivetrain) {
        this.drivetrain = drivetrain;
    }

    /**
     * Gets the DriveTrain configuration of this AdvancedSetup.
     *
     * @return The DriveTrain configuration.
     */

    public DriveTrain getDrivetrain() {
        return drivetrain;
    }

}
