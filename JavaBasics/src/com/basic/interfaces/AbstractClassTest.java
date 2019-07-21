/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces;

import static com.util.Print.*;

/**
 *
 * @author arane
 */
abstract class Shape{
    abstract void calArea();
    void what(){ print("Shape"); }
    public Shape(){
    	print("Calling Shape construnctor..!!");
    };
}

class Triangle extends Shape{
    
    double base,height;
    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    
    @Override
    void calArea() {
         print("Triangle | calArea() : "+0.5*base*height);
    }
}

class Circle extends Shape{
    
    double radius;
    private static final double PI = 3.1416;
    Circle(double radius){
        this.radius = radius;
    }
    
    @Override
    void calArea() {
        print("Circle\t | calArea() : "+PI*radius*radius);
    }
}
public class AbstractClassTest {
    public static void main(String[] args){
        Shape[] shapes = { new Triangle(3,4), new Circle(4.5)};
        for(Shape s : shapes){
            s.calArea();
        }
        
        //Shape s = new Shape(){}; //Error: Implement All Abstract Methods.
        printLearning("You can create Abstract class without including any abstract methods.",
            "Abstract Method : Only declaration and no body.",
            "Abstract Class  : Class containing zero or more absract methods.",
            "If you inherit from abstract class :\n"
                + "\t - Make objects of derive Type.\n"
                + "\t - Must provide method definitions for all abstract methods, otherwise derive class is also abstract.");
        Object o = new Object();
    }
}
