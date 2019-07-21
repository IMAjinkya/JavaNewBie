/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.initialization;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
class Home{
    
    static int home_cnt;
    static double home_length;
    static double home_width;
    static double calHome_area(){
        return 2 * (home_length + home_width);
    }
   
    static{
        print("HOME \t| In Static Initialization Block...!!!");
        home_length = 50;
        home_width = 50;
    } 
    {
        home_cnt++;
        print("HOME \t| In Instance Initialization Block...!!!["+home_cnt+"]");
    }
    String ownerName;
    String address;
    Home(String owner,String address){
        System.out.println("HOME \t| In Parametrized Constructor..!!!");
        this.ownerName = owner;
        this.address = address;
    }
    
    
    Door eastDoor = new Door("East");
    Window eastWindow = new Window("East");
    Window northWindow = new Window("North");   
}

class Door{
    static int door_height;
    static int door_width;
    static{
        System.out.println("DOOR \t| In Static Initialization Block...!!!");
        door_height = 10;
        door_width = 5;
    }
    String facingDirection;
    public Door(String f_dir){
        System.out.println("DOOR \t| Parameterized Constructor..!!! : "+f_dir);
        this.facingDirection = f_dir;
    }
}

class Window{
    static int window_height;
    static int window_width;
    static int window_count;
    static{
        System.out.println("WINDOW \t| In Static Initialization Block...!!!");
        window_height = 5;
        window_width = 5;
    }
    String facingDirection;
    {
        System.out.println("WINDOW \t| In Intance initilization Block...!!!");
        window_count++;
    }
    public Window(String f_dir){
        System.out.println("WINDOW \t| Parameterized Constructor..!!! : "+f_dir);
        this.facingDirection = f_dir;
    }
}

public class OrderOfInitializationTest {
    public static void main(String[] args){
        Home h = new Home("BOB","27 Street,NY");
        System.out.println("Total Window counts : "+Window.window_count);
        printLearning(
            "Variables are initialize before any methods can be called, Even before constructor",
            "Static member variables get initialize(if they haven't get initialized already in a previous object creation) before non-static member variables.",
            "Static initialization in special 'STATIC CLAUSE'. Executed only once",
            "\t- 1st time access object of that class",
            "\t- 1st time access static member of that class",
            "Instance initilization clause allows you to guarantee that certain operations occur regardless of which explicit constructor is called."
        );
    }
}
