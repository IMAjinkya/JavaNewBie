/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.decoupling;

/**
 *
 * @author arane
 */
public class Filter {

    public String getName() {
        return getClass().getSimpleName();
    }
    
    public Waveform process(Waveform input) {
        return input;
    }
}
