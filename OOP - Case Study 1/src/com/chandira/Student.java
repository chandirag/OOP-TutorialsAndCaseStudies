package com.chandira;

import java.util.InputMismatchException;

public class Student {
    private String firstName;
    private String lastName;
    private int regNo;
    private double marksForMinorAssignment01;
    private double marksForMinorAssignment02;
    private double marksForProjectDesign;
    private double marksForProjectImplementation;
    private double marksForFinalExam;

    public Student() {};
    public Student(String firstName, String lastName, int regNo) {
        setFirstName(firstName);
        setLastName(lastName);
        setRegNo(regNo);
    }
    public Student(String firstName, String lastName, int regNo, double marksForMinorAssignment01,
                   double marksForMinorAssignment02, double marksForProjectDesign, double marksForProjectImplementation,
                   double marksForFinalExam) {
        setFirstName(firstName);
        setLastName(lastName);
        setRegNo(regNo);
        setMarksForMinorAssignment01(marksForMinorAssignment01);
        setMarksForMinorAssignment02(marksForMinorAssignment02);
        setMarksForProjectDesign(marksForProjectDesign);
        setMarksForProjectImplementation(marksForProjectImplementation);
        setMarksForFinalExam(marksForFinalExam);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getRegNo() {
        return regNo;
    }
    public double getMarksForMinorAssignment01() {
        return marksForMinorAssignment01;
    }
    public double getMarksForMinorAssignment02() {
        return marksForMinorAssignment02;
    }
    public double getMarksForProjectDesign() {
        return marksForProjectDesign;
    }
    public double getMarksForProjectImplementation() {
        return marksForProjectImplementation;
    }
    public double getMarksForFinalExam() {
        return marksForFinalExam;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setMarksForMinorAssignment01(double marksForMinorAssignment01) throws IllegalArgumentException, InputMismatchException {
        if (0 <= marksForMinorAssignment01 && marksForMinorAssignment01 <= 100 ) {
            this.marksForMinorAssignment01 = marksForMinorAssignment01;
        } else if (marksForMinorAssignment01 > 100 || marksForMinorAssignment01 < 0) {
            throw new IllegalArgumentException("Enter a value between (including) 0 and 100.");
        } else {
            throw new InputMismatchException("Please enter a numeric value.");
        }
    }

    public void setMarksForMinorAssignment02(double marksForMinorAssignment02) {
        if (0 <= marksForMinorAssignment02 && marksForMinorAssignment02 <= 100 ) {
            this.marksForMinorAssignment02 = marksForMinorAssignment02;
        } else if (marksForMinorAssignment02 > 100 || marksForMinorAssignment02 < 0) {
            throw new IllegalArgumentException("Enter a value between (including) 0 and 100.");
        } else {
            throw new InputMismatchException("Please enter a numeric value.");
        }
    }

    public void setMarksForProjectDesign(double marksForProjectDesign) {
        if (0 <= marksForProjectDesign && marksForProjectDesign <= 100 ) {
            this.marksForProjectDesign = marksForProjectDesign;
        } else if (marksForProjectDesign > 100 || marksForProjectDesign < 0) {
            throw new IllegalArgumentException("Enter a value between (including) 0 and 100.");
        } else {
            throw new InputMismatchException("Please enter a numeric value.");
        }
    }

    public void setMarksForProjectImplementation(double marksForProjectImplementation) {
        if (0 <= marksForProjectImplementation && marksForProjectImplementation <= 100 ) {
            this.marksForProjectImplementation = marksForProjectImplementation;
        } else if (marksForProjectImplementation > 100 || marksForProjectImplementation < 0) {
            throw new IllegalArgumentException("Enter a value between (including) 0 and 100.");
        } else {
            throw new InputMismatchException("Please enter a numeric value.");
        }
    }

    public void setMarksForFinalExam(double marksForFinalExam) {
        if (0 <= marksForFinalExam && marksForFinalExam <= 100 ) {
            this.marksForFinalExam = marksForFinalExam;
        } else if (marksForFinalExam > 100 || marksForFinalExam < 0) {
            throw new IllegalArgumentException("Enter a value between (including) 0 and 100.");
        } else {
            throw new InputMismatchException("Please enter a numeric value.");
        }
    }

    public double calculateMinorAssignmentMarks() {
        double minorAssignment01Marks = this.marksForMinorAssignment01 * (6.0/100.0);
        double minorAssignment02Marks = this.marksForMinorAssignment02 * (9.0/100.0);
        return minorAssignment01Marks + minorAssignment02Marks;
    }

    public double calculateProjectMarks() {
        double projectDesignMarks = this.marksForProjectDesign * (15.0/100.0);
        double projectImplementationMarks = this.marksForProjectImplementation * (20.0/100.0);
        return projectDesignMarks + projectImplementationMarks;
    }

    public double calculateFinalMarks() {
        double minorAssignmentMarks = calculateMinorAssignmentMarks();
        double projectMarks = calculateProjectMarks();
        return minorAssignmentMarks + projectMarks + (this.marksForFinalExam * 0.5);
    }

    public String calculateGrade() {
        double minorAssignmentMarks = calculateMinorAssignmentMarks();
        double projectMarks = calculateProjectMarks();
        double finalMarks = calculateFinalMarks();
        if (this.marksForFinalExam >= 50 && (minorAssignmentMarks * (100.0/15) >= 35
        && (projectMarks * (100.0/35) >= 35))) {
            if (finalMarks >= 80) {
                return "Higher Distinction";
            } else if (finalMarks >= 70) {
                return "Distinction";
            } else if (finalMarks >= 60) {
                return "Credit";
            } else if (finalMarks >= 50) {
                return "Pass";
            } else {
                return "Fail";
            }
        } else {
            return "Fail";
        }
    }
}
