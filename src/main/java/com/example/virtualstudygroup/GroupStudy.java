package com.example.virtualstudygroup;

import java.util.ArrayList;
import java.util.List;

class GroupStudy implements StudySession {
    int StudentCount;
    String CoreSubject;
    String studName;

List<String>studentsName = new ArrayList<>();

    public GroupStudy(String CoreSubject, int StudentCount,String studName){
        this.CoreSubject = CoreSubject;
        this.StudentCount = StudentCount;
        this.studName=studName;
    }

    void addStudentsName(String studName){
    studentsName.add(studName);
    }

    public void StartSession(){
        System.out.println("Session starts by 09:00AM +GMT");
    }
    public void EndSession(){
        System.out.println("Session ends by 05:00PM +GMT");
    }
    void getDetails(){
        System.out.println("This is a Groupstudy option and the Coresubject is :"+CoreSubject);
        System.out.println("The number of students enrolled are "+StudentCount);
        System.out.println("List of students in the group:");
        for (String student : studentsName) {
            System.out.println(student);
        }
    }
}
