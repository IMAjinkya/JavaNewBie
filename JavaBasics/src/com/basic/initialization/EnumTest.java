/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.initialization;

/**
 *
 * @author ajinkya_rane
 */
enum DegreeLevels {
    FAILED, PASSED, SECOND_CLASS, FIRST_CLASS, DISTINCTION
}

class Student{
    String name;
    int roll;
    int marks;
    DegreeLevels degree;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        setDegree();
    }
    
    final void setDegree(){
        if(marks > 80){
            this.degree = DegreeLevels.DISTINCTION;
        }
        else if(marks >= 60){
            this.degree = DegreeLevels.FIRST_CLASS;
        }
        else if(marks >= 50){
            this.degree = DegreeLevels.SECOND_CLASS;
        }
        else if(marks >= 40){
            this.degree = DegreeLevels.PASSED;
        }
        else{
            this.degree = DegreeLevels.FAILED;
        }
        
    }
}

public class EnumTest {
    static void describeDegrees(Student student){
        String printText = student.name+" have ";
        switch(student.degree){
            case DISTINCTION : 
                System.out.println(printText+"achieved "+student.degree+" and scored >= 80 marks");
                break;
            case FIRST_CLASS : 
                System.out.println(printText+"achieved "+student.degree+" and scored >= 60 marks");
                break;
            case SECOND_CLASS : 
                System.out.println(printText+"achieved "+student.degree+" and scored >= 50 marks");
                break;
            case PASSED : 
                System.out.println(printText+student.degree+" with >= 40 marks");
                break;
            case FAILED : 
                System.out.println(printText+student.degree+" with < 40 marks");
                break;
        }
    }
    
    public static void printAllDegrees(){
        for(DegreeLevels degreeLevels : DegreeLevels.values()){
            System.out.println(degreeLevels.ordinal()+":"+degreeLevels.name());
        }
    }
    
    public static void main(String[] args){
        Student s1 = new Student("Ross", 111, 55);
        Student s2 = new Student("Monica", 222, 85);
        Student s3 = new Student("Joey", 333, 35);
        System.out.println("1. Using ENUM in SWITCH Case : describeDegrees for all"
                + "\n===================================================");
        describeDegrees(s1);
        describeDegrees(s2);
        describeDegrees(s3);
        System.out.println("\n2. Using values() of ENUM : printAllDegrees"
                + "\n===========================================");
        printAllDegrees(); 
    }
    
}
