package com.company;

/**
 * Created by tkoleva on 08/09/16.
 */
public interface Airport {

    void landAirplane(Airplane airplane);

    void takeOffAirplane(Airplane airplane);

    void hourHasPassed();

    void printWaitingForLanding();

}
