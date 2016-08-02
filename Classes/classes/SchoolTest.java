package com.company.classes;

/**
 * Created by tkoleva on 08/01/16.
 */
public class SchoolTest {
    School school = new School();

    SchoolClass classA1 = new SchoolClass();
    SchoolClass classA2 = new SchoolClass();

    StudentInClass studentOne = new StudentInClass();
    StudentInClass studentTwo = new StudentInClass();
    StudentInClass studentThree = new StudentInClass();

    Teacher mathTeacher = new Teacher();
    Teacher biologyTeacher = new Teacher();

    Discipline mathDiscipline = new Discipline();
    Discipline biology = new Discipline();

    public void init(){
        initSchool();
        initClasses();
        initStudent();
        initTeacher();
        initDiscipline();
    }

    public void initSchool(){
        school.setName("Math School");

        school.getClasses().add(classA1);
        school.getClasses().add(classA2);
//        school.addClass(classA1);

        school.getStudents().add(studentOne);
        school.getStudents().add(studentTwo);
        school.getStudents().add(studentThree);
//        school.addStudent(studentOne);
    }

    public void initClasses(){
        classA1.setClassID("A1");
        classA2.setClassID("A2");

        classA1.getTeacher().add(mathTeacher);
        classA2.getTeacher().add(biologyTeacher);
    }

    public void initStudent(){
        studentOne.setFirstName("Mariya");
        studentOne.setLastName("Blagoeva");
        studentOne.setStudentID("PK32434");

        studentTwo.setFirstName("Cenko");
        studentTwo.setLastName("Senov");
        studentTwo.setStudentID("PK1234");

        studentThree.setFirstName("Opa");
        studentThree.setLastName("Opa");
        studentThree.setStudentID("PK45678");
    }

    public void initTeacher(){
        mathTeacher.setFirstName("Metodi");
        mathTeacher.setLastName("Kirilov");
        mathTeacher.getDisciplines().add(mathDiscipline);
//        mathTeacher.addDiscipline(mathDiscipline);

        biologyTeacher.setFirstName("George");
        biologyTeacher.setLastName("Georgiev");
        biologyTeacher.getDisciplines().add(biology);
    }

    public void initDiscipline(){
        mathDiscipline.setName("Math");
        mathDiscipline.setClassNumber(24);
        mathDiscipline.setExerciseNumber(48);

        biology.setName("Biology");
        biology.setClassNumber(12);
        biology.setExerciseNumber(24);
    }

    public void printSchoolData(){
        System.out.println("Your test school is: " + school.getName());
        System.out.println();

        System.out.println("This school has the following classes: ");
        for (SchoolClass schoolClass: school.getClasses()) {
            System.out.println(schoolClass.getClassID());
        }
        System.out.println();

        System.out.println("The following students are in this school: ");
        for (StudentInClass studentsInSchool: school.getStudents()) {
            System.out.print(studentsInSchool.getFirstName() + " " + studentsInSchool.getLastName());
            System.out.println(" with ID: " + studentsInSchool.getStudentID());
        }
        System.out.println();

        System.out.println("Students in class " + classA1.getClassID() + " have the following teachers: ");
        for (Teacher printTeacher: classA1.getTeacher()) {
            System.out.println(printTeacher.getFirstName() + " " + printTeacher.getLastName());
            System.out.println("This teacher is teaching: " + mathDiscipline.getName());
        }
        System.out.println();

        System.out.println("Students in class " + classA2.getClassID() + " have the following teachers: ");
        for (Teacher printTeacher: classA2.getTeacher()) {
            System.out.println(printTeacher.getFirstName() + " " + printTeacher.getLastName());
            System.out.println("This teacher is teaching: " + biology.getName());
        }
        System.out.println();

    }
}
