package com.company.classes;

import java.util.ArrayList;

/**
 * Created by tkoleva on 08/01/16.
 */
public class School {

    private String name;
    private ArrayList<StudentInClass> students = new ArrayList<>();
    private ArrayList<SchoolClass> classes = new ArrayList<>();

    public String getName() {
        return name;
    }

    public ArrayList<StudentInClass> getStudents() {
        return students;
    }

    public ArrayList<SchoolClass> getClasses() {
        return classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<StudentInClass> students) {
        this.students = students;
    }

    public void setClasses(ArrayList<SchoolClass> classes) {
        this.classes = classes;
    }

    public void addStudent(StudentInClass student){
        students.add(student);
    }

    public void addClass(SchoolClass newClass){
        classes.add(newClass);
    }

    public void removeStudentByLastName(String name){
        if (students.size() > 0){
            for (StudentInClass searchStudent: students) {
                if(name.equals(searchStudent.getLastName())) {
                    students.remove(searchStudent);
                    System.out.println("Removed student: " + searchStudent.getLastName());
                } else {
                    System.out.println("There is no student with this last name.");
                }
            }
        }
    }

    public void removeClassByID(String classID){
        if (classes.size() > 0){
            for (SchoolClass searchClass: classes) {
                if(classID.equals(searchClass.getClassID())) {
                    students.remove(searchClass);
                    System.out.println("Removed class: " + searchClass.getClassID());
                } else {
                    System.out.println("There is no class with this ID.");
                }
            }
        }
    }
}
