package com.example.virtualstudygroup;

public class MockExamPreparation implements StudySession{

    String NameOfStudent, TypeOfMockExam;
    public MockExamPreparation(String NameOfStudent,String TypeOfMockExam){
        this.NameOfStudent=NameOfStudent;
        this.TypeOfMockExam=TypeOfMockExam;
    }

    public void StartSession(){
        System.out.println("Session starts by 09:00AM +GMT");
    }
    public void EndSession(){
        System.out.println("Session ends by 11:00AM +GMT");
    }

    public void FixSchedule(){
        System.out.println(NameOfStudent+"'s mock exam type is "+TypeOfMockExam+" and it is scheduled in the above mentioned sessions");
    }

}
