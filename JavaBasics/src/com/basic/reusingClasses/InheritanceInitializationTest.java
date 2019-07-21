/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.reusingClasses;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
class TestAnimalComposition{

    public TestAnimalComposition(int num) {
        print("ANIMAL_COMP\t| Constructor : "+num+"=============Called before Instance initialization [Odd than composition]================");
    } 
}

class Animal{ 
    
    int age;
    TestAnimalComposition tac = new TestAnimalComposition(0);
    static{
        print("ANIMAL\t\t| Static Initialization block.");
    }
    {
        print("ANIMAL\t\t| Instance Initialization block.");
    }
    public Animal() {
        print("ANIMAL\t\t| Constructor");
    }
    public Animal(int age) {
        this.age = age;
        print("ANIMAL\t\t| Parameterized Constructor : "+age);
    }
    public Animal(int age,boolean callSuper) {
        this.age = age;
        print("ANIMAL\t\t| Parameterized Constructor : "+age);
    }
}

class Dog extends Animal{
    TestAnimalComposition tac1 = new TestAnimalComposition(1);
    static int noofDogs;
    static{
        print("DOG \t\t| Static Initialization block.");
    }
    {
        noofDogs++;
        print("DOG \t\t| Instance Initialization block.["+noofDogs+"]");
    }
    public Dog() { 
        print("DOG\t\t| Constructor");
    }
    public Dog(int age) { 
        //Not calling Super here, hence not able to set age in parent class.
        print("DOG\t\t| Parameterized Constructor : "+age);
    }
    public Dog(int age,boolean callSuper) {
        super(age,callSuper);
        print("DOG\t\t| Parameterized Constructor : "+age);
    }
}
class StreetDog extends Dog{
    static int noofSteetDogs;
    static{
        print("STEETDOG \t| Static Initialization block.");
    }
    {
        noofSteetDogs++;
        print("STEETDOG \t| Instance Initialization block.["+noofDogs+"]");
    }
    public StreetDog() { 
        print("STREETDOG\t| Constructor");
    }
    public StreetDog(int dummyInt) {
        print("STREETDOG\t| Parameterized Constructor : "+dummyInt);
    }
    public StreetDog(int dummyInt,boolean callSuper) {
        super(dummyInt,callSuper);
        print("STREETDOG\t| Parameterized Constructor : "+dummyInt);
    }
}
public class InheritanceInitializationTest {
    public static void main(String[] args){
        print("Calling Default Derive Class :");
        StreetDog sd = new StreetDog();
        print();
        print("Calling Parameterized Derive Class without calling 'Super':");
        StreetDog sd1 = new StreetDog(10);
        print();
        print("Calling Parameterized Derive Class with calling 'Super':");
        StreetDog sd2 = new StreetDog(13,true); 
        print();
        printLearning(
            "Java implicitly call base class default constructor from derive class constructor",
            "Parameterized base class constructor can be called explicitly from derive class constructor using 'SUPER' keyword"
        );   
    }
}
