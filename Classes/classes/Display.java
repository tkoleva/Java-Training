package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */

//Task 8
public class Display {
    private String size;
    private String[] colours = new String[5];

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

    public String getSize() {
        return size;
    }

    public String[] getColours() {
        return colours;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setColours(String[] colours) {
        this.colours = colours;
    }
}
