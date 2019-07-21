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
public class Parcel_Anonymous1 {

    public Wrapping wrapping(int x) {
        // Base constructor call:
        return new Wrapping(x) { // Pass constructor argument.
            public int value() {
                return super.value() * 47;
            }
        }; // Semicolon required
    }

    public static void main(String[] args) {
        Parcel_Anonymous1 p = new Parcel_Anonymous1();
        Wrapping w = p.wrapping(10);
        print(w);
        printLearning("if your base class needs a constructor with an argument then that needs to be passed "
        + "\nwhile calling anonymous class constructor");
    }
}
