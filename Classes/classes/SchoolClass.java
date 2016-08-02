package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 08/01/16.
 */
public class SchoolClass {

    private String classID;
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public String getClassID() {
        return classID;
    }

    public ArrayList<Teacher> getTeacher() {
        return teachers;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public void setTeacher(ArrayList<Teacher> teacher) {
        this.teachers = teacher;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(String firstName){
        if (teachers.size() > 0){
            for (Teacher searchTeacher: teachers) {
                if(firstName.equals(searchTeacher.getFirstName())) {
                    teachers.remove(searchTeacher);
                    System.out.println("Removed teacher: " + searchTeacher.getFirstName());
                } else {
                    System.out.println("There is no teacher with this first name.");
                }
            }
        }
    }
}
