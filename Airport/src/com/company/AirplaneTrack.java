package com.company;

/**
 * Created by tkoleva on 08/09/16.
 */
public interface AirplaneTrack {
    Airplane land();

    Airplane takeOff();

    void occupyTrack(Airplane airplane, boolean isLanding);

    boolean isAvailable();

    boolean isUsedForLanding();
}
