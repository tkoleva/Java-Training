package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */
//Task 8
public class Battery {
    private static String model;
    private static String idleTime;
    private static Double hoursTalk;


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

    public static Double getHoursTalk() {
        return hoursTalk;
    }

    public static String getModel() {
        return model;
    }

    public static String getIdleTime() {
        return idleTime;
    }

    public static void setHoursTalk(Double hoursTalk) {
        Battery.hoursTalk = hoursTalk;
    }

    public static void setModel(String model) {
        Battery.model = model;
    }

    public static void setIdleTime(String idleTime) {
        Battery.idleTime = idleTime;
    }
}
