/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces.interfaceProcessor;

/**
 *
 * @author arane
 */
public interface Processor {
    String getName();
    Object process(Object input);
}
