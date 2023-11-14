package com.mycompany.jsonfilereader;

public class BasicSetup {

    Tyres tyres;
    Alignment alignment;

    public BasicSetup(Tyres tyres) {
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public BasicSetup(Alignment alignment) {
        this.alignment = alignment;
    }

    public Alignment getAlignment() {
        return alignment;
    }
    
    
    

}
