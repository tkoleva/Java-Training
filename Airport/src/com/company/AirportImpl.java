package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by tkoleva on 08/09/16.
 */
public class AirportImpl implements Airport {

    private Queue<Airplane> waitingForLanding = new PriorityQueue<>();
    private Queue<Airplane> waitingToTakeOff = new PriorityQueue<>();
    private List<Airplane> dockedAirPlanes = new ArrayList<>();
    private AirplaneTrack[] tracks;

    public AirportImpl(int trackNum) {
        tracks = new AirplaneTrack[trackNum];
        for (int i = 0; i < tracks.length; i++) {
            tracks[i] = new AirplaneTrackImpl("Track " + i);
        }
    }

    @Override
    public void landAirplane(Airplane airplane) {
        AirplaneTrack track = availableTrack();
        if (track != null){
            track.occupyTrack(airplane, true);
            System.out.println(airplane.getName() + " is going to land on " + track.toString());
        } else {
            waitingForLanding.add(airplane);
            System.out.println(airplane.getName() + " is waiting for landing.");
        }
    }

    @Override
    public void takeOffAirplane(Airplane airplane) {
        AirplaneTrack track = availableTrack();
        if (track != null){
            track.occupyTrack(airplane, false);
            System.out.println(airplane.getName() + " is going to take off from " + track.toString());
        } else {
            waitingToTakeOff.add(airplane);
            System.out.println(airplane.getName() + " is waiting to take off.");
        }
    }

    @Override
    public void hourHasPassed() {
        System.out.println("An hour has passed...");
        deoccupyTracks();
        occupyTracks();

    }

    private void occupyTracks() {
        for (int i = 0; i < tracks.length; i++) {
            AirplaneTrack track = tracks[i];
            if (track.isAvailable()){
                if (track.isUsedForLanding() && waitingForLanding.size() > 0){
                    Airplane airplane = waitingForLanding.element();
                    track.occupyTrack(airplane, true);
                    System.out.println("Airplane " + airplane.getName() + " is going to land on Track " + i);
                    waitingForLanding.remove(airplane);
                } else if (!track.isUsedForLanding() && waitingToTakeOff. size() > 0) {
                    Airplane airplane = waitingToTakeOff.element();
                    track.occupyTrack(airplane, false);
                    System.out.println("Airplane " + airplane.getName() + "is going to take off from track " + i);
                    waitingToTakeOff.remove(airplane);
                }
            }
        }
    }

    private void deoccupyTracks() {
        for (int i = 0; i < tracks.length; i++) {
            AirplaneTrack track = tracks[i];
            if(!track.isAvailable()){
                if (track.isUsedForLanding()){
                    Airplane airplane = track.land();
                    dockedAirPlanes.add(airplane);
                    System.out.println(airplane.getName() + " has landed.");
                } else {
                    Airplane airplane = track.takeOff();
                    System.out.println(airplane.getName() + " has taken off.");
                }
            }
        }
    }

    private AirplaneTrack availableTrack() {
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i].isAvailable()) {
                return tracks[i];
            }
        }
        return null;
    }

    @Override
    public void printWaitingForLanding() {
        for (Airplane airplane : waitingForLanding) {
            System.out.println(airplane.getName() + " " + airplane.getFuel());
        }
    }
}
