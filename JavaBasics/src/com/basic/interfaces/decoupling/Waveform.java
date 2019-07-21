/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.decoupling;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author arane
 */
public class Waveform {

    private int[] band;
    private int bandLength;
    
    
    public Waveform(int bandLength){
        Random r = new Random();
        this.bandLength = bandLength;
        band = new int[bandLength];
        for(int bandItr = 0; bandItr < bandLength; bandItr++){
            band[bandItr] = r.nextInt(50);
        }
        Arrays.sort(band);
    }

    @Override
    public String toString() {
        return "Waveform " + Arrays.toString(band);
    }
    
    public int[] lowFilter(int cutOff){
        return band = Arrays.copyOfRange(band, cutOff, band.length);
    }
    
    public int[] highFilter(int cutOff){
        return band = Arrays.copyOfRange(band, 0, cutOff);
    }
    
    public int[] bandFilter(int lowCutOff,int highCutOff){
        return band = Arrays.copyOfRange(band, lowCutOff, highCutOff);
    }
}
