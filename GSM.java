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
    private static ArrayList<Call> callList = new ArrayList<>();

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

    //Task 15
    public static void addCall(){
        callList.add(new Call());
    }

    // Task 15
    public static void deleteCall(int index){
        callList.remove(index);
    }

    // Task 15
    public static void deleteAllCalls(){
        callList.clear();
    }

    //Task 16
    public static void getTotalCallPrice(double price){
        double totalPrice;
        totalPrice = callList.size() * price;
    }

    public static void gsmTest(){
        GSM gsmModel = new GSM(model);
        GSM gsmModelBrand = new GSM(model, brand);
        GSM gsm = new GSM(price, owner);
    }

    //Task 12
    public static void printInfo(){
        System.out.println(GSM.getPrice());
        System.out.println(GSM.getBrand());
        System.out.println(GSM.getModel());
        System.out.println(GSM.getOwner());
    }
}
