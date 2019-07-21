/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.polymorphism;

import static com.util.Print.*;
import java.util.Random;

/**
 *
 * @author arane
 */
class Shape{
    public void draw(){
        print("SHAPE \t\t| Draw()");
    }
}
class Circle extends Shape{
    @Override
    public void draw(){
        print("Circle \t\t| Draw()");
    }
}
class Triangle extends Shape{
    @Override
    public void draw(){
        print("TRIANGLE \t| Draw()");
    }
}
class Square extends Shape{
    @Override
    public void draw(){
        print("SQUARE \t\t| Draw()");
    }
}
class RandomShapeGenerator{
    private final Random rand = new Random(47);
    public Shape next(){
        switch(rand.nextInt(3)){
            case 0 : return new Circle();
            case 1 : return new Triangle();
            case 2 : return new Square();
            default :return new Shape();
        }
    }
}

public class ShapeGenerationTest {
    
    private static final RandomShapeGenerator shapeGen = new RandomShapeGenerator();
    public static void main(String[] args){
        Shape[] shapeFactory = new Shape[9];
        for(int factoryItr = 0; factoryItr < shapeFactory.length; factoryItr++)
            shapeFactory[factoryItr] = shapeGen.next();
        for(Shape s : shapeFactory)
            s.draw();
        printLearning("Polymorphism allows us to forget that there are Derive classes and allows us to write code"
                + " only with Base class \n   where Derive class object reference can be passed while method calling.",
                "Late Binding (Based on Type of an object): All methods in Java uses late binding except for STATIC or FINAL (&private)",
                "Polymorphism provides Extensibility");
    }
}
