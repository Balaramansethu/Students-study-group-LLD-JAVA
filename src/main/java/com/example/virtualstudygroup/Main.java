package com.example.virtualstudygroup;

import com.example.virtualstudygroup.GroupStudy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What type of study you want to choose :");
        System.out.println("1.Groupstudy");
        System.out.println("2.Solostudy");
        int input = scan.nextInt();
        switch (input) {
            case 1 -> {
                System.out.println("Enter core subject for Group Study:");
                String coreSubject = scan.nextLine();
                scan.nextLine();
                System.out.println("Enter the number of students:");
                int studentCount = scan.nextInt();
                scan.nextLine();
                GroupStudy groupStudy = new GroupStudy(coreSubject,studentCount,"deepak");
                System.out.println("Enter student name:");
                for (int i = 0; i < studentCount; i++) {
                    String studentName = scan.nextLine();
                    groupStudy.addStudentsName(studentName);
                }
                groupStudy.StartSession();
                groupStudy.EndSession();
                groupStudy.getDetails();
            }
            case 2 -> {
                System.out.println("Enter student name for Solo Study:");
                String name = scan.next();
//                scan.nextLine();

                System.out.println("Enter core subject for Solo Study:");
                String soloSubject = scan.next();


                SoloStudy soloStudy = new SoloStudy(name, soloSubject);
                soloStudy.StartSession();
                soloStudy.EndSession();
                soloStudy.getDetails();

            }
        }
        scan.close();

    }
}