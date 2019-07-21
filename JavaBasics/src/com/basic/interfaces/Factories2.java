/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces;

import static com.util.Print.*;

/**
 *
 * @author arane
 */
interface Service{
    void method1();
    void method2();
}

interface ServiceFactory{
    Service getService();
}

class Implementation1 implements Service{

    @Override
    public void method1() {
        print("Implementation 1 | Method 1");
    }

    @Override
    public void method2() {
        print("Implementation 1 | Method 2");
    } 
}

class Implementation2 implements Service{

    @Override
    public void method1() {
        print("Implementation 2 | Method 1");
    }

    @Override
    public void method2() {
        print("Implementation 2 | Method 2");
    } 
}

class Implemenation1Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Implementation1();
    } 
}

class Implemenation2Factory implements ServiceFactory{

    @Override
    public Service getService() {
        return new Implementation2();
    } 
}

public class Factories2 {
    static void consumer(ServiceFactory sf){
        Service s = sf.getService();
        s.method1();
        s.method2();
    }
    
    public static void main(String[] args){
        consumer(new Implemenation1Factory());
        consumer(new Implemenation2Factory());
        printLearning("This is example of 'Abstract Factory Pattern'",
        "One can extend Service hierarchy without affecting Factory implementation");
    }
}
