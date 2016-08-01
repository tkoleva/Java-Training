package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 07/21/16.
 */

//Task 8
public class GSM {
    private static String model = "Test model";
    private static String brand = "Test brand";
    private static Double price = 300.00;
    private static String owner = "Test owner";

    //Task 10
    private static String nokiaN95 = "Mobile phone model Nokia95";

    //Task 13
    private ArrayList<Call> callList = new ArrayList<>();

    //Task 9
    public GSM(){

    }

    public GSM(String model){
        GSM.model = model;
        brand = null;
        price = 0.0;
        owner = null;
    }

    public GSM(String model, String brand){
        GSM.model = model;
        GSM.brand = brand;
        price = 0.0;
        owner = null;
    }

    public GSM(double price, String owner){
        GSM.price = price;
        GSM.owner = owner;
        model = null;
        brand = null;
    }

    public static String getModel() {
        return model;
    }

    public static String getBrand() {
        return brand;
    }

    public static Double getPrice() {
        return price;
    }

    public static String getOwner() {
        return owner;
    }

    //Task 10
    public static String getNokiaN95() {
        return nokiaN95;
    }

    public static void setModel(String model) {
        GSM.model = model;
    }

    public static void setBrand(String brand) {
        GSM.brand = brand;
    }

    public static void setPrice(Double price) {
        GSM.price = price;
    }

    public static void setOwner(String owner) {
        GSM.owner = owner;
    }

    //Task 10
    public static void setNokiaN95(String nokiaN95) {
        GSM.nokiaN95 = nokiaN95;
    }


    //Task 12
    public static void printInfo(){
        System.out.println(GSM.getPrice());
        System.out.println(GSM.getBrand());
        System.out.println(GSM.getModel());
        System.out.println(GSM.getOwner());
    }

    //Task 14
    public ArrayList<Call> callHistory(){
        return callList;
    }

    //Task 15
    public void addCall(Call call){
        callList.add(call);
    }

    // Task 15
    public void deleteCall(int index){
        if (callList.size() > index){
            callList.remove(index);
        } else {
            System.out.println("No element with that index.");
        }
    }

    // Task 15
    public void deleteAllCalls(){
        callList.clear();
    }

    //Task 16
    public double getTotalCallPrice(double price){
        return (getDurationAllCallsInMs() / 60000.0) * price;
    }

    public long getDurationAllCallsInMs(){
        long allDuration = 0;
        for (Call call: callList) {
            allDuration += call.getCallDuration();
        }
        return allDuration;
    }
}
