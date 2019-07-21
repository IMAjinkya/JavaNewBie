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
 */
public class PitfallsBase {
    private void f(){
        print("BASE(Private func) \t   | f()");
    }
    int field = 0;
    int getField(){ return field;}
    
    static void staticFunc(){
        print("BASE \t\t\t   | staticFunc()");
    }
    public static void main(String[] args){
        print("Upcast :\n=================");
        PitfallsBase pf1 = new PitfallDerive();
        pf1.f();   
        print("Field Access\t\t   | "+pf1.field);
        print("Field Access (via method)  | "+pf1.getField());
        pf1.staticFunc();
        print("");
        
        print("Derive class :\n=================");
        PitfallDerive pf2 = new PitfallDerive();
        //pf2.f();          //Can not access as it is private   
        print("Field Access\t\t   | "+pf2.field);
        print("Field Access (via method)  | "+pf2.getField());
        pf2.staticFunc();
        print("");
        
        printLearning(
        		"Private method is automatically FINAL, and is also hidden from derive class. By same signature you will get new method in derive class",
                "When a SUB object is upcast to SUPER reference, any field accesses are resolved by the COMPILER and are NOT POLYMORPHIC."
        );
    }
}

class PitfallDerive extends PitfallsBase{
    
    //@Override
    private void f(){
        print("DERIVE(Private func) \t   | f()");
    }
    int field = 1;
    
    @Override
    int getField(){ return field;}
    
    //@Override
    static void staticFunc(){
        print("DERIVE \t\t\t   | staticFunc()");
    }
}
