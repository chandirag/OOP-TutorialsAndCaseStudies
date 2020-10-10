package com.chandira;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
//        inputs.add("Enter First Name: ");
//        inputs.add("Enter Last Name: ");
//        inputs.add("Enter Reg. No: ");
        inputs.add("Enter marks for Minor Assignment 01: ");
        inputs.add("Enter marks for Minor Assignment 02: ");

        Student student = new Student();



        for(int i = 0; i < inputs.size(); i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(inputs.get(i));
        }
    }
}
