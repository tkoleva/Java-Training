package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */
public class Battery {
    String model;
    String idleTime;
    Double hoursTalk;

    public Battery(String model){
        this.model = model;
        idleTime = null;
        hoursTalk = 0.0;
    }

    public Battery(String model, String idleTime){
        this.model = model;
        this.idleTime = idleTime;
        hoursTalk = 0.0;
    }

    public Battery(double hoursTalk){
        this.hoursTalk = hoursTalk;
        model = null;
        idleTime = null;
    }
}
