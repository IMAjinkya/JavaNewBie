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
public class Parcel_Anonymous2 {
// Argument must be final to use inside
// anonymous inner class:

    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel_Anonymous2 p = new Parcel_Anonymous2();
        Destination d = p.destination("Tasmania");
        print(d);
        printLearning("If you are defining an anonymous inner class and want to use an object that’s defined outside the anonymous inner class,"
        + "\nthe compiler requires that the argument reference be final");
        
    }
}
