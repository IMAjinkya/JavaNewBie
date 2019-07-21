/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.classProcessor;

import com.basic.interfaces.decoupling.HighPass;
import com.basic.interfaces.decoupling.Filter;
import com.basic.interfaces.decoupling.Waveform;
import com.basic.interfaces.decoupling.LowPass;
import com.basic.interfaces.decoupling.BandPass;
import com.basic.interfaces.*;
import static com.util.Print.*;


/**
 *
 * @author arane
 */
public class ApplyFilterProcessor {
    private static Waveform w = new Waveform(20);
    public static Waveform process(Filter f){
        return f.process(w);
    }
    public static void main(String[] args){
        print(w);
        print(process(new LowPass(5)));
        print(process(new HighPass(10)));
        print(process(new BandPass(4,6)));
    }
}
