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
enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

interface Instrument {
    int VALUE = 5;          // static & final : Compile-time constant:
    void play(Note n);      // Automatically public Cannot have method definitions:
    void adjust();
}

class Wind implements Instrument {

    @Override
    public void play(Note n) {
        print(this + "| play() " + n);
    }

    @Override
    public String toString() {
        return "Wind\t\t";
    }

    @Override
    public void adjust() {
        print(this + "| adjust()");
    }
}

class Percussion implements Instrument {

    @Override
    public void play(Note n) {
        print(this + "| play() " + n);
    }

    @Override
    public String toString() {
        return "Percussion\t";
    }

    @Override
    public void adjust() {
        print(this + "| adjust()");
    }
}

class Stringed implements Instrument {

    @Override
    //void play(Note n) {                              /*******1********/
    public void play(Note n) {            
        print(this + "| play() " + n);
    }

    @Override
    public String toString() {
        return "Stringed\t";
    }

    @Override
    public void adjust() {
        print(this + "| adjust()");
    }
}

class Brass extends Wind {

    @Override
    public String toString() {
        return "Brass\t\t";
    }
}

class Woodwind extends Wind {

    @Override
    public String toString() {
        return "Woodwind\t";
    }
}

public class InterfaceTest {
// Doesn’t care about type, so new types
// added to the system still work right:

    static void tune(Instrument i) {
        print(i.VALUE);
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {              // Upcasting during addition to the array:
            new Wind(),
            new Percussion(),
            new Stringed(),
            new Brass(),
            new Woodwind()
        };
        tuneAll(orchestra);
        
        
        Woodwind ww = new Woodwind();
        print("Woodwind object is instanceof Woodwind : "+ (ww instanceof Woodwind));
        print("Woodwind object is instanceof Wind : "+ (ww instanceof Wind));
        print("Woodwind object is instanceof Instrument : "+ (ww instanceof Instrument));
        print("Woodwind object is instanceof Object : "+ (ww instanceof Object));
    }
}
