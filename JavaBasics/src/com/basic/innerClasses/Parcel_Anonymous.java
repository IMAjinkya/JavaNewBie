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
interface Contents{
    int value();
}
public class Parcel_Anonymous {

    public Contents contents() {
        return new Contents() {                     // Insert a class definition
            private int i = 11;

            @Override
            public int value() { return i; }
            
            @Override
            public String toString(){ return getClass().getSimpleName() + "\t| i :"+i; }
        }; // Semicolon required in this case
    }

    public static void main(String[] args) {
        Parcel_Anonymous p = new Parcel_Anonymous();
        Contents c = p.contents();
        print(c);
        print(c instanceof Contents);
        printLearning(
            "\"Create an object of an anonymous class that’s inherited from Contents.\"",
            "The reference returned by the new expression is automatically upcast to a Contents reference."
        );
    }
}
