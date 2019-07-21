/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.polymorphism;

import static com.util.Print.*;

/**
 *
 * @author arane
 */
enum Note{
    MIDDLE_C,C_SHARP,B_FLAT;
}
class Instrument{
    public void play(Note n){
        print("Playing an instrument.");
    }
}
class Wind extends Instrument{
    @Override
    public void play(Note n){
        print("Playing wind instrument.");
    }
}
public class UpcastingTest {
    static void tune(Instrument i){
        i.play(Note.B_FLAT);
    }
    
    public static void main(String[] args){
        Wind flute = new Wind();
        tune(flute);
        printLearning("Upcasting from Wind(Derive class) to Instrument(Base class) may narrow that interface, "
                + "\n   but it cannot make it anything less than the full interface to Instrument(Base class).");
    }
}
