/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.innerClasses;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
interface Selector {

    boolean isEnd();

    Object getCurrentObj();

    void next();
}

//The Sequence is simply a fixed-sized array of Object with a class wrapped around it.
public class Sequence {

    private Object[] items;
    private int seqItr = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (seqItr < items.length) {
            items[seqItr++] = x;
        }
    }

    private class SequenceSelector implements Selector {

        private int itr = 0;

        @Override
        public boolean isEnd() {
            return (itr == items.length);
        }

        @Override
        public Object getCurrentObj() {
            return items[itr];
        }

        @Override
        public void next() {
            if (itr < items.length) {
                itr++;
            }
        }
    }

    public Selector getSelector() {
        return new SequenceSelector();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.getSelector();
        while (!selector.isEnd()) {
            System.out.print(selector.getCurrentObj() + " ");
            selector.next();
        }
        System.out.println();
        printLearning(
            "The inner class can access methods and fields from the enclosing class as if it owned them.",
            "An object of an inner class can be created only in association with an object of the enclosing class"
        );
        
    }
}
