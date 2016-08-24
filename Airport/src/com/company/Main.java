package com.company;

public class Main {

    public static void main(String[] args) {
        Airport ovoshtnikAirport = new AirportImpl(1);

        ovoshtnikAirport.landAirplane(new AirplaneImpl("Airbus 355", 45.37));
        ovoshtnikAirport.landAirplane(new AirplaneImpl("Boing 757", 453.573));
        ovoshtnikAirport.landAirplane(new AirplaneImpl("Chesna AA123", 342.53));

        ovoshtnikAirport.printWaitingForLanding();
        ovoshtnikAirport.hourHasPassed();
        ovoshtnikAirport.takeOffAirplane(new AirplaneImpl("Boing 747", 2311.341));

    }
}
