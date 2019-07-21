/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.reusingClasses;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */

class Calc {
    public int add(int a,int b){
        return a+b;
    }
    public float add(float a,float b){
        return a+b;
    }
    public Calc returnSelf(Calc calc){
        print("Calling bas class method with : "+calc.getClass()+" instance");
        return calc;
    }
}

class SciFiCalc extends Calc {
    public void add(String dummy){
        print("Base Class  method overloaded in Derive Class");
    }
}
public class InheritanceMethodOverloadingTest {
    public static void main(String[] args){
        SciFiCalc sfc = new SciFiCalc();
        print("Base class Method : "+sfc.add(1, 2));
        print("Base class Method : "+sfc.add(1.1f, 2.2f));
        sfc.add("");
        
        sfc.returnSelf(sfc);
        
        printLearning(
            "Overloading works regardless of whether the method was defined at base or derive level",
            "Annotation @Override prevents errorneous overloading instead of overriding",
            "New Class is a type of existing class, Here, Upcasting argument and returning covarient data type."
        );
    }
}
