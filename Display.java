package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */

//Task 8
public class Display {
    private static String size;
    private static String[] colours = new String[5];

    public Display(String size){
        this.size = size;
        colours = null;
    }

    public Display(String[] colours){
        this.colours = colours;
        size = null;
    }

    public Display(String size, String[] colouts){
        this.colours = colouts;
        this.size = size;
    }

    public static String getSize() {
        return size;
    }

    public static String[] getColours() {
        return colours;
    }

    public static void setSize(String size) {
        Display.size = size;
    }

    public static void setColours(String[] colours) {
        Display.colours = colours;
    }
}
