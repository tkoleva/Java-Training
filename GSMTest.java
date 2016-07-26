package com.company.classes;

import java.util.Arrays;

/**
 * Created by tkoleva on 07/25/16.
 */

// Task 12
public class GSMTest {
    static GSM[] gsmArray = new GSM[5];

    public static void createGsmArray(){
        for (int i = 0; i < gsmArray.length; i++) {
            GSM gsmObject = new GSM();

            gsmArray[i] = gsmObject;
        }
        System.out.println(Arrays.toString(gsmArray));
        GSM.printInfo();
        System.out.println(GSM.getNokiaN95());
    }


}
