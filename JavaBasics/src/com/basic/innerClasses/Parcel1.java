/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.innerClasses;

import static com.util.Print.*;

/**
 *
 * @author arane
 */
public class Parcel1 {
    class Contents{
        private int i = 11;
        public int getValue(){
            return i;
        }
        
        @Override
        public String toString(){
            return getClass().getSimpleName() + "\t | i: "+i;
        }
    }
    class Destination{
        private String label;
        Destination(){ print(getClass().getSimpleName()+"\t | Default Constructor"); }
        private Destination(String whereToGo){
            label = whereToGo;
        }
        String readLabel(){ return label; }
        
        @Override
        public String toString(){
            return getClass().getSimpleName() + "\t | label: "+label;
        }
        
        Parcel1 getOuter(){ return Parcel1.this; }
    }
    
    
    public Destination to(String destination){
        return new Destination(destination);
    }
    
    public Contents getContents(){
        return new Contents();
    }
    
    public void ship(String dest){
        Contents c = getContents();
        Destination d = new Destination(dest);
        print("Destination label : "+d.readLabel());
        print(c);
        print(d);
    }
    
    public static void main(String[] args){
        
        print("1. Defining references to inner classes via outer class's method");
        Parcel1 p1 = new Parcel1();
        p1.ship("Tasmania");
           
        print("\n2. Defining references to inner classes directly");
        Parcel1 p2 = new Parcel1();
        Parcel1.Contents c = p2.getContents();
        Parcel1.Destination d = p2.to("Borneo");
        print(c);
        print(d);
        
        print("\n3. Defining references to inner classes using .new operator");
        Parcel1 p3 = new Parcel1();
        Parcel1.Contents c1 = p3.new Contents(); 
        Parcel1.Destination d1 = p3.new Destination("Borneo");
        print(c1);
        print(d1);
        print("Outer.this \t | "+d1.getOuter().getClass().getSimpleName());
        
        printLearning(
            "Inner Classes allows you to group classes that logically belong together and to control the visibility of one within the other.",
            "It’s important to understand that inner classes are distinctly different from composition.",
            "If you want to make an object of the inner class anywhere except from within a non-static method of the outer class,"
            + "\n   you must specify the type of that object as OuterClassName.InnerClassName",
            "outerClass.this                | Accessing outer class object inside inner class",
            "outerclassObj.new innerClass() | creating inner class object using outer class object"
        );
    }
}
