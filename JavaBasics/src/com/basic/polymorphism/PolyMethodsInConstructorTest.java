/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.polymorphism;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
class Circlee{
    private static final double PI = 3.14;
    int radius = 1;
    Circlee(){
        print("Circle Constructor");
        print("Before calArea()");
        calArea();
        print("After calArea()");
    }
    void calArea(){
        print("Circle\t| Area(2PIr) : "+(2*PI*radius));
    }
}

class Ellipse extends Circlee{
    private static final double PI = 3.14;
    int radius1 = 5;
    int radius2 = 4;
     
    Ellipse(){
        print("Ellipse Constructor");
        print("Before calArea()");
        calArea();
        print("After calArea()");
    }
    @Override
    void calArea(){
        print("Ellipse\t| Area(PIr1r2) : "+(PI*radius1*radius2));
    }
}
public class PolyMethodsInConstructorTest {
    public static void main(String[] args){
        Ellipse e = new Ellipse();
        print("Huhh...!! Ellipse Area called twice..!!");
        printLearning(
        		"Do as little as possible to set the object into a good state, and if you can possibly avoid it, don't call any other methods in this class.",
                "The only safe methods to call inside a constructor are those that are final/private in the base class."
        );
    }
}
