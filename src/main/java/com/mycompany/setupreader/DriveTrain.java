package com.mycompany.setupreader;

public class DriveTrain {
    long preload;

    public void printValues() {

        System.out.println("Drivetrain preload: " + this.preload);
    }

    public DriveTrain(long preload) {
        this.preload = preload;
        printValues();
    }

    public long getPreLoad() {
        return preload;
    }
}
