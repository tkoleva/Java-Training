package com.company.classes;

/**
 * Created by tkoleva on 07/19/16.
 */
public class Student {

    private String firstName;
    private String middleName;
    private String familyName;
    private byte course;
    private String specialty;
    private String universityName;
    private String email;
    private String phoneNumber;
    private static int initCount;

    public Student(){
        Student.initCount++;
    }

    public Student(String firstName, String middleName, String familyName){
        this.firstName = firstName;
        this.middleName = middleName;
        this.familyName = familyName;
        course = 0;
        specialty = null;
        universityName = null;
        email = null;
        phoneNumber = null;
        Student.initCount++;
    }

    public Student(byte course, String specialty){
        this.course = course;
        this.specialty = specialty;
        firstName = null;
        middleName = null;
        familyName = null;
        Student.initCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public byte getCourse() {
        return course;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getInitCount() {
        return initCount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public void setCourse(byte course) {
        this.course = course;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static void setInitCount(int initCount) {
        Student.initCount = initCount;
    }

    public void showAllData(){
        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(familyName);
        System.out.println(course);
        System.out.println(specialty);
        System.out.println(universityName);
        System.out.println(email);
        System.out.println(phoneNumber);
        System.out.println(initCount);
        Student.initCount++;
    }
}

