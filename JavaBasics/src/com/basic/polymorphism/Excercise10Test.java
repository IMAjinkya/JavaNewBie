/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.polymorphism;

import static com.util.Print.*;

/**
 *
 * @author arane
 * Exercise 10: Create a base class with two methods. In the first method, call the second method. 
 * 				Inherit a class and override the second method. 
 * 				Create an object of the derived class, upcast it to the base type, and call the first method. 
 * 				Explain what happens.
 */

class BaseType{
    void method1(){
        print("BASETYPE \t| Calling Method 1");
        print("And...");
        method2();
    }
    void method2(){
        print("BASETYPE \t| Calling Method 2");
    }
}

class DeriveType extends BaseType{
    @Override
    void method2(){
        print("DERIVETYPE \t| Calling Method 2");
    }
}
public class Excercise10Test {
   public static void main(String[] args){
        
        print("Implicit Upcast :\n=================");
        BaseType bt1 = new DeriveType();
        bt1.method1();                      
        print("");
        
        print("Only BaseType :\n=================");
        BaseType bt2 = new BaseType();
        bt2.method1();
        print("");
        
        print("Only DeiveType :\n=================");
        DeriveType dt3 = new DeriveType();
        dt3.method1();
        print("");
    }
}
