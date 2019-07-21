/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.innerClasses;

/**
 *
 * @author arane
 */
public class Wrapping {

    private int i;
    public Wrapping(int x) { i = x; }
    public int value() { return i; }
    
    @Override
    public String toString(){ 
        return getClass().getSimpleName() + "\t | i : "+i; 
    }
}
