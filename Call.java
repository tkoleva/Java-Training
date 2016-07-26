package com.company.classes;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by tkoleva on 07/25/16.
 */

//Task 13
public class Call {
    private static Date callDate;
    private static double callDuration;
    private static Date callStart;
    private static int callCount;

    public static ArrayList<Call> callList = new ArrayList<>();

    //Task 16
    public Call(){
        Call.callCount++;
    }

    public static ArrayList<Call> callHistory(){
        return callList;
    }
}
