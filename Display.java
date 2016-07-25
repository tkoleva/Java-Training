package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */
public class Display {
    String size;
    String[] colours = new String[5];

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
}
