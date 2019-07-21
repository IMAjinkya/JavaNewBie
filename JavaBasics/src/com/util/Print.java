/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.util;

import java.io.PrintStream;

/**
 *
 * @author ajinkya_rane
 */
public class Print {
    // Print with a newline:
    public static void print(Object obj) {
        System.out.println(obj);
    }
    
    // Print a newline by itself:
    public static void print() {
        System.out.println();
    }
    
    // Print with no line break:
    public static void printnb(Object obj) {
        System.out.print(obj);
    }
    
    // The new Java SE5 printf() (from C):
    public static PrintStream printf(String format, Object... args) {
        return System.out.printf(format, args);
    }
    public static void printLearning(String... points){
        print("\nLearnings:\n==========");
        int pointCnt = 0; 
        for(String point : points){
            print(++pointCnt+". "+point);
        }
        print();
    }

    public static void printMenu(String... menuItems){
    	print("Select option from following :");
    	int strCnt = 1;
    	for(String s : menuItems){
    		print(strCnt++ + ": " +s);
    	}
    	
    }
}
