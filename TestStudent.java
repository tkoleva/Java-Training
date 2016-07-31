package com.company.classes;

/**
 * Created by tkoleva on 07/21/16.
 */
public class TestStudent{
    private static Student firstStudent;
    private static Student secondStudent;
    private static Student thirdStudent;

    public static Student getFirstStudent() {
        return firstStudent;
    }

    public static Student getSecondStudent() {
        return secondStudent;
    }

    public static Student getThirdStudent() {
        return thirdStudent;
    }

    public static void initStudents(){
        firstStudent = new Student();
        secondStudent = new Student();
        thirdStudent = new Student();

        firstStudent.setFirstName("Trayana");
        secondStudent.setFirstName("Lazar");
        thirdStudent.setFirstName("David");
    }

    public static void printStudentsInfo(){
        System.out.println(firstStudent.getFirstName());
        System.out.println(secondStudent.getFirstName());
        System.out.println(thirdStudent.getFirstName());
    }

    public static void testStudent() {
        Student student = new Student();

        String firstName = "John";
        String middleName = "Jo";
        String familyName = "Adams";
        byte course = 2;
        String specialty = "Computer science";
        String universityName = "Technical University Sofia";
        String email = "tkoleva@objectsystems.com";
        String phoneNumber = "6473353463";

        student.setFirstName(firstName);
        student.setMiddleName(middleName);
        student.setFamilyName(familyName);
        student.setCourse(course);
        student.setSpecialty(specialty);
        student.setUniversityName(universityName);
        student.setEmail(email);
        student.setPhoneNumber(phoneNumber);

        student.showAllData();
        student.getInitCount();

        Student newStudent = new Student();
        System.out.println(newStudent.getMiddleName());
        student.getInitCount();
    }
}