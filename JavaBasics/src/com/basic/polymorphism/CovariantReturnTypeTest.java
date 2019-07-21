/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.polymorphism;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
class Grain{
    @Override
    public String toString(){ return "Grain"; }
}

class Wheat extends Grain{
    @Override
    public String toString(){ return "Wheat"; }
}

class Mill{
    public Grain Process(){ return new Grain(); }
}

class WheatMill extends Mill{
	@Override
    public Wheat Process(){ return new Wheat(); }
}
public class CovariantReturnTypeTest {
    public static void main(String[] args){
        Mill m = new Mill();
        print(m.Process());
        m = new WheatMill();
        print(m.Process());
        printLearning("Covariant Return Types(SE5) : An overridden method in a derived class can return a type derived from the type returned by the base-class method");
    }
}
