package com.chandira;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Student student = new Student("Chandira", "Gunatilleke", 2019593,
//                35, 35, 50,
//                50, 50);
//        System.out.println("Minor Assignment Marks: " + student.getMinorAssignmentMarks() + " / 15");
//        System.out.println("Project Marks: " + student.getProjectMarks() + " / 35");
//        System.out.println("Final Exam Marks: " + student.getMarksForFinalExam() + " / 100");
//        System.out.println("Total: " + student.getFinalMarks() + " / 100");
//        System.out.println("Grade: " + student.calculateGrade());

        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        student.setFirstName(scanner.nextLine());

        System.out.print("Enter Last Name: ");
        student.setLastName(scanner.nextLine());

        System.out.print("Enter Reg. No: ");
        student.setRegNo(scanner.nextInt());

        System.out.print("Enter Minor Assignment 01 Marks: ");
        try {
            student.setMarksForMinorAssignment01(scanner.nextDouble());
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a value between (including) 0 and 100!");
        } catch (InputMismatchException e) {
            System.out.println("Enter a numeric value!");
        }

        System.out.print("Enter Minor Assignment 02 Marks: ");
        try {
            student.setMarksForMinorAssignment02(scanner1.nextDouble());
        } catch (IllegalArgumentException e) {
            System.out.println("Enter a value between (including) 0 and 100!");
        } catch (InputMismatchException e) {
            System.out.println("Enter a numeric value!");
        }

        System.out.print("Enter Project Design Marks: ");
        student.setMarksForProjectDesign(scanner.nextDouble());

        System.out.print("Enter Project Implementation Marks: ");
        student.setMarksForProjectImplementation(scanner.nextDouble());

        System.out.print("Enter Final Exam Marks: ");
        student.setMarksForFinalExam(scanner.nextDouble());

        System.out.println("-----------------------------");
        System.out.println("Minor Assignment Marks: " + student.calculateMinorAssignmentMarks() + " / 15");
        System.out.println("Project Marks: " + student.calculateProjectMarks() + " / 35");
        System.out.println("Final Exam Marks: " + student.getMarksForFinalExam() + " / 100");
        System.out.println("Total: " + student.calculateFinalMarks() + " / 100");
        System.out.println("Grade: " + student.calculateGrade());

    }
}
