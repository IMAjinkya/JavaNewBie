package com.basic.initialization;

import static com.util.Print.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajinkya_rane
 */
public class constructorTest {
    
    int a;
    final int CONST_A;
    final static int CONST_B;
    static int CONST_C;
    
    static{
        CONST_B = 20;
        CONST_C = 22;
        System.out.println("In static block");
    }
    constructorTest() {
        System.out.println("In default Constructor Block");
        CONST_A = 0;
    }
    
    constructorTest(int a) {
        System.out.println("In Parameterized Constructor Block : "+a);
        this.CONST_A = 123;
        this.a = a;
    }
    
    constructorTest(int a,boolean constA_zero) {
        this();
        System.out.println("In Parameterized Constructor Block : "+a);
        this.CONST_C = a;
        this.a = a;
    }
    
    void readA(){
        System.out.println("Member a\t :"+a);
        System.out.println("Final \t\t :CONST_A:"+this.CONST_A);
        System.out.println("Final Static \t :CONST_B:"+CONST_B);
        System.out.println("Final Static \t :CONST_C:"+CONST_C);
    }
    
    public static void main(String[] args){
        //1. Parameterized contructor overrides default constructor 
        //constructorTest ct = new constructorTest();   //COMPILE TIME ERROR
        
        constructorTest ct = new constructorTest();
        ct.readA();
        constructorTest ct1 = new constructorTest(10);
        ct1.readA();
        constructorTest ct2 = new constructorTest(30,true);
        ct2.readA();
        printLearning(
            "Static Block get called only before '1ST' object initialization..!!",
            "Final variable can be initialize only once (at the time of definition or in constructor)",
            "Static variables can be modified in non-static method but vice-versa is not possible.",
            "'this' keyword is used to call constructor from another constructor."
        );
    }
}
