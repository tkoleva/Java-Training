package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 08/01/16.
 */
public class Teacher {

    private String firstName;
    private String lastName;
    private ArrayList<Discipline> disciplines;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Discipline> getDisciplines() {
        return disciplines;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDisciplines(ArrayList<Discipline> disciplines) {
        this.disciplines = disciplines;
    }

    public void addDiscipline(Discipline discipline){
        disciplines.add(discipline);
    }

    public void removeDisciplineByName(String name){
        if (disciplines.size() > 0){
            for (Discipline searchDiscipline : disciplines) {
                if(name.equals(searchDiscipline.getName())) {
                    disciplines.remove(searchDiscipline);
                    System.out.println("Removed discipline: " + searchDiscipline.getName());
                } else {
                    System.out.println("There is no discipline with this name.");
                }
            }
        }
    }
}
