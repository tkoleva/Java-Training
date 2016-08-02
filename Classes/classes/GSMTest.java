package com.company.classes;

/**
 * Created by tkoleva on 07/25/16.
 */

// Task 12
public class GSMTest {
    GSM[] gsmArray = new GSM[5];
    GSM gsm = new GSM();

    public void createGsmArray(){
        for (int i = 0; i < gsmArray.length; i++) {
            GSM gsmObject = new GSM();
            gsmArray[i] = gsmObject;
        }
    }

    public void initGSMs(){
        gsmArray[0].setBrand("Google Nexus");
        gsmArray[0].setModel("5X");
        gsmArray[0].setOwner("Trayana");
        gsmArray[0].setPrice(850.00);

        gsmArray[1].setBrand("Google Nexus");
        gsmArray[1].setModel("5X");
        gsmArray[1].setOwner("Lazar");
        gsmArray[1].setPrice(650.00);

        gsmArray[2].setBrand("Google Nexus");
        gsmArray[2].setModel("5X");
        gsmArray[2].setOwner("David");
        gsmArray[2].setPrice(650.00);

        gsmArray[3].setBrand("Google Nexus");
        gsmArray[3].setModel("4");
        gsmArray[3].setOwner("Sve");
        gsmArray[3].setPrice(400.00);

        gsmArray[4].setBrand("Google Nexus");
        gsmArray[4].setModel("6P");
        gsmArray[4].setOwner("Krasi");
        gsmArray[4].setPrice(1200.00);
    }

    public void printGSMInfo(){
        System.out.println("The following phones are available: ");
        for (int i = 0; i < gsmArray.length; i++) {
            System.out.println("Brand: " + gsmArray[i].getBrand());
            System.out.println("Model: " + gsmArray[i].getModel());
            System.out.println("Owner: " + gsmArray[i].getOwner());
            System.out.println("Price: " + gsmArray[i].getPrice());
            System.out.println();
        }
    }

    public void printNokia95(){
        System.out.println(GSM.getNokiaN95());
    }
}
