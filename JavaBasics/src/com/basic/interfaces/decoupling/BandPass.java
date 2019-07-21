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
public class BandPass extends Filter {

    int lowCutoff, highCutoff;
    public BandPass(int lowCut, int highCut) {
        lowCutoff = lowCut;
        highCutoff = highCut;
    }

    @Override
    public Waveform process(Waveform input) {
        input.bandFilter(lowCutoff,highCutoff);
        return input;
    }
}
