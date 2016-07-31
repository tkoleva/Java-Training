package com.company.classes;

/**
 * Created by tkoleva on 07/25/16.
 */

//Task 13
public class Call {

    private long callStart;
    private long callDuration;

    private static int callCount;

    //Task 16
    public Call(){
        Call.callCount++;
        callStart = System.currentTimeMillis();
    }

    public static int getCallCount() {
        return callCount;
    }

    public long getCallStart() {
        return callStart;
    }

    public long getCallDuration() {
        return callDuration;
    }

    public void endCall() {
        callDuration = System.currentTimeMillis() - callStart;
    }

}
