package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */
public class GSM {
    private static String model;
    private static String brand;
    private static Double price;
    private static String owner;

    private static String nokiaN95 = "Mobile phone model Nokia95";

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

    public static void setNokiaN95(String nokiaN95) {
        GSM.nokiaN95 = nokiaN95;
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

    public static void gsmTest(){
        GSM gsmModel = new GSM(model);
        GSM gsmModelBrand = new GSM(model, brand);
        GSM gsm = new GSM(price, owner);
    }
}
