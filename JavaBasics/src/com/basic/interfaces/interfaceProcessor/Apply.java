/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.interfaceProcessor;

import static com.util.Print.*;

/**
 *
 * @author arane
 */
public class Apply {

    public static void process(Processor p, Object s) {
        print("Using Processor " + p.getName());
        print(p.process(s));
    }
}
