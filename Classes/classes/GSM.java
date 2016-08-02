package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 07/21/16.
 */

//Task 8
public class GSM {
    private String model;
    private String brand;
    private Double price;
    private String owner;

    //Task 10
    private static String nokiaN95 = "Mobile phone model Nokia95";

    //Task 13
    private ArrayList<Call> callList = new ArrayList<>();

    //Task 9
    public GSM(){
    }

    public GSM(String model){
        this.model = model;
        brand = null;
        price = 0.0;
        owner = null;
    }

    public GSM(String model, String brand){
        this.model = model;
        this.brand = brand;
        price = 0.0;
        owner = null;
    }

    public GSM(double price, String owner){
        this.price = price;
        this.owner = owner;
        model = null;
        brand = null;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public Double getPrice() {
        return price;
    }

    public String getOwner() {
        return owner;
    }

    //Task 10
    public static String getNokiaN95() {
        return nokiaN95;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    //Task 10
    public static void setNokiaN95(String nokiaN95) {
        GSM.nokiaN95 = nokiaN95;
    }

    public void initGSM(){
        model = "Test model";
        brand = "Test brand";
        price = 300.00;
        owner = "Test owner";
    }

    //Task 12
    public void printInfo(){
        System.out.println(getPrice());
        System.out.println(getBrand());
        System.out.println(getModel());
        System.out.println(getOwner());
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
