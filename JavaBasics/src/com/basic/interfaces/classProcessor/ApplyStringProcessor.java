/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.classProcessor;

import static com.util.Print.*;
import java.util.Arrays;

/**
 *
 * @author arane
 */
class Processor{
    public String getName(){
        return getClass().getSimpleName();
    }
    
    public Object process(Object input){
        return input;
    }
}

class UpCase extends Processor{

    @Override
    public Object process(Object input) {
        return ((String)input).toUpperCase();
    }

    @Override
    public String getName() {
        return getClass().getSimpleName(); 
    }
}

class LowCase extends Processor{

    @Override
    public Object process(Object input) {
        return ((String)input).toLowerCase();
    }

    @Override
    public String getName() {
        return getClass().getSimpleName(); 
    }
}

class Splitter extends Processor{

    @Override
    public Object process(Object input) {
        return Arrays.toString(((String)input).split(" "));
    }

    @Override
    public String getName() {
        return getClass().getSimpleName(); 
    }
}

public class ApplyStringProcessor {
    public static void process(Processor p,Object o){
        print("Using Processor " + p.getName());
        print(p.process(o));
    }
    
    public static String s = "Disagreement with beliefs is by definition incorrect";
    public static void main(String[] args) {
        process(new UpCase(), s);
        process(new LowCase(), s);
        process(new Splitter(), s);
    }
}
