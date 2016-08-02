package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */
//Task 8
public class Battery {
    private String model;
    private String idleTime;
    private Double hoursTalk;


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

    public Double getHoursTalk() {
        return hoursTalk;
    }

    public String getModel() {
        return model;
    }

    public String getIdleTime() {
        return idleTime;
    }

    public void setHoursTalk(Double hoursTalk) {
        this.hoursTalk = hoursTalk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setIdleTime(String idleTime) {
        this.idleTime = idleTime;
    }
}
