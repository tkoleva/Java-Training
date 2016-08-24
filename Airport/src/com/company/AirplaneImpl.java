package com.company;

/**
 * Created by tkoleva on 08/09/16.
 */
public class AirplaneImpl implements Airplane {

    private String name;
    private double fuel;

    public AirplaneImpl(String name, double fuel) {
        this.name = name;
        this.fuel = fuel;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getFuel() {
        return fuel;
    }

    @Override
    public int compareTo(Airplane o) {
        if (this.fuel < o.getFuel()) {
            return -1;
        } else if (this.fuel > o.getFuel()){
            return 1;
        } else {
            return 0;
        }
    }
}
