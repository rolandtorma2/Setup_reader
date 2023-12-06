package com.mycompany.setupreader;

/**
 * The DriveTrain class represents the drivetrain configuration of a vehicle,
 * including the preload setting.
 */
public class DriveTrain {

    long preload;

    /**
     * Constructs a DriveTrain instance with a specified preload setting.
     *
     * @param preload The preload setting for the drivetrain.
     */
    public void printValues() {

        System.out.println("Drivetrain preload: " + this.preload);
    }

    public DriveTrain(long preload) {
        this.preload = preload;
        printValues();
    }

    /**
     * Gets the preload setting of this DriveTrain configuration.
     *
     * @return The preload setting.
     */
    public long getPreLoad() {
        return preload;
    }
}
