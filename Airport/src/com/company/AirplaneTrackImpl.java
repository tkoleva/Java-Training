package com.company;

/**
 * Created by tkoleva on 08/09/16.
 */
public class AirplaneTrackImpl implements AirplaneTrack {
    private Airplane plane;
    private String name;
    private boolean isLanding;

    public AirplaneTrackImpl(String name) {
        this.name = name;
    }

    @Override
    public Airplane land() {
        Airplane airplane = plane;
        if (!isAvailable()){
            plane = null;
        } else {
            throw new IllegalStateException("The track is not available");
        }
        return airplane;
    }

    @Override
    public Airplane takeOff() {
        Airplane airplane = plane;
        if (plane != null){
            plane = null;
        } else {
            throw new IllegalStateException("There are no planes to take off.");
        }
        return airplane;
    }

    @Override
    public void occupyTrack(Airplane airplane, boolean isLanding) {
        if (isAvailable()){
            this.isLanding = isLanding;
            plane = airplane;
        } else {
            throw new IllegalStateException("This track is not available.");
        }
    }

    @Override
    public boolean isAvailable() {
        return plane == null;
    }

    @Override
    public boolean isUsedForLanding() {
        return isLanding;
    }

    @Override
    public String toString() {
        return name;
    }


}
