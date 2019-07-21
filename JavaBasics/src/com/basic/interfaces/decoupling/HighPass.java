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
public class HighPass extends Filter {

    int cutoff;

    public HighPass(int cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public Waveform process(Waveform input) {
        input.highFilter(cutoff);
        return input;
    }
}
