/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.interfaceProcessor;

import com.basic.interfaces.decoupling.HighPass;
import com.basic.interfaces.decoupling.Filter;
import com.basic.interfaces.decoupling.Waveform;
import com.basic.interfaces.decoupling.LowPass;
import com.basic.interfaces.decoupling.BandPass;
import static com.util.Print.*;

/**
 *
 * @author arane
 */


class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String getName() {
        return filter.getName();
    }

    @Override
    public Waveform process(Object input) {
        return filter.process((Waveform) input);
    }
}

public class FilterProcessor {

    public static void main(String[] args) {
        Waveform w = new Waveform(20);
        print(w);
        Apply.process(new FilterAdapter(new LowPass(5)), w);
        Apply.process(new FilterAdapter(new HighPass(10)), w);
        Apply.process(new FilterAdapter(new BandPass(4,6)), w);
    }
}


