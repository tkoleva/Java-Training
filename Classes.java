package com.company;

import com.company.classes.Library;

public class Classes {

    public static void main(String[] args) {

//        TestStudent.testStudent();
//        TestStudent.initStudents();
//        GSM.gsmTest();
//        TestStudent.printStudentsInfo();
//        GSMTest.createGsmArray();

//        GSMCallHistoryTest callHistoryTest = new GSMCallHistoryTest();
//        callHistoryTest.executeCallHistoryTest();
        Library library = new Library();
        library.testAddCall();
        library.findBookByAuthor("Sir Terry Pratchett");
    }

}
