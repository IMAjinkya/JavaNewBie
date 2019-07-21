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
public class Parcel_AnonymousContructor {

    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;
            
            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            
            private String label = dest;
            
            @Override
            public String readLabel() { return label; }
        };
    }

    public static void main(String[] args) {
        Parcel_AnonymousContructor p = new Parcel_AnonymousContructor();
        Destination d = p.destination("Tasmania", 101.395F);
        print(d);
        printLearning(
            "You can’t have a named constructor in an anonymous class (since there’s no name!),"
            + "\nbut with instance initialization, you can, in effect, create a constructor for an anonymous inner class.",
            "The arguments to super inner class must be 'FINAL' since they are used within the anonymous class"
        );
    }
}
