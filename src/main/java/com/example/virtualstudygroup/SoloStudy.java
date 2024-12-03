package com.example.virtualstudygroup;

public class SoloStudy implements StudySession
{
String name, subject;
    public SoloStudy(String name,String subject){
        this.name = name;
        this.subject=subject;
    }
    public void StartSession(){
        System.out.println("Session starts by 09:00AM +GMT");
    }
    public void EndSession(){
        System.out.println("Session ends by 05:00PM +GMT");
    }

    void getDetails(){
        System.out.println("This is a solostudy option and the Coresubject is :"+subject);
        System.out.println("The student name is :"+name);
    }
}
