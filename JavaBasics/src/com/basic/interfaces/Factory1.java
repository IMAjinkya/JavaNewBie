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
interface Product{
    void method1();
}

class ProductImpl implements Product{

    @Override
    public void method1() {
        print("Method 1");
    }  
}

class ProductFactory{
    Product getProduct(){
        return new ProductImpl();
    }
}
public class Factory1 {
    static void Client(ProductFactory pf){
        Product p = pf.getProduct();
        p.method1();
    }
    
    public static void main(String[] args){
        Client(new ProductFactory());
        printLearning("This is 'Factory Pattern'",
                "Client need not to know how to create concrete product",
                "Adding a Concrete Product will require change in Factory");
    }
}
