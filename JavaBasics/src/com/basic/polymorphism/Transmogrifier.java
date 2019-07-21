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
class Actor {
    public void act() {}
}

class HappyActor extends Actor {

    @Override
    public void act() { print("HappyActor"); }
}

class SadActor extends Actor {

    @Override
    public void act() { print("SadActor"); }
}

class Stage {

    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void performPlay() { actor.act(); }
}

public class Transmogrifier {

    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
        
        printLearning("A better approach is to choose composition first, especially when it's not obvious which one you should use. "
            + "\n   Composition does not force a design into an inheritance hierarchy. But composition is also more flexible since it's possible to dynamically choose a type (and thus behavior)",
            "Use inheritance to express differences in behavior, and fields(Composition) to express variations in state.");
    }
}
