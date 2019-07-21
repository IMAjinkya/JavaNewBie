/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.initialization;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
public class SimpleMethodOverloadingTest {
    public static void add(String a,String b){
        System.out.println("Adding String a and b ="+a.concat(b));
    }
    
    public static void add(int a,int b){
        System.out.println("Adding integers a and b ="+(a + b));
    }
    
    public static void displayRoleNo(int a,String b){
        System.out.println(a+" is role number of "+b);
    }
    
    //Difference in ordering
    public static void displayRoleNo(String a,int b){
        System.out.println(a+"'s role number is "+b);
    }
    
    //ERROR: method add(int,int) is already frsined in class ...
    //public static int add(int a,int b){}
    
    public static void main(String[] args){
        add("Hello"," World");
        add(5,5);
        
        displayRoleNo("John", 23);
        displayRoleNo(54, "Lily");
        
        printLearning(
            "Overloaded method must take unique list of argument types.",
            "Even difference in ordering overloads method.",
            "No overloading on 'return' values.",
            "Parameterize Constructor is example of Method Overloading."
        );
    }
}
