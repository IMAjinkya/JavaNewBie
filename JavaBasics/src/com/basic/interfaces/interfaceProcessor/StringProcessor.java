/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.interfaceProcessor;

import java.util.Arrays;

/**
 *
 * @author arane
 */
public abstract class StringProcessor implements Processor {

    @Override
    public String getName() {
        return getClass().getSimpleName();
    }
    public static String s = "If she weighs the same as a duck, she is made of wood";
    
    @Override
    public abstract String process(Object input);
    public static void main(String[] args) {
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
    }
}

class Upcase extends StringProcessor {

    @Override
    public String process(Object input) { // Covariant return
        return ((String) input).toUpperCase();
    }
}

class Downcase extends StringProcessor {

    @Override
    public String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends StringProcessor {

    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}
