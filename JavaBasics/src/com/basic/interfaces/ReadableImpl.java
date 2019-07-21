/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.interfaces;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ajinkya_rane
 */
public class ReadableImpl implements Readable {

    private static final Random rand = new Random(47);
    private static final char[] capitals
            = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers
            = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels
            = "aeiou".toCharArray();
    private int count;

    public ReadableImpl(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1; // Indicates end of input
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(vowels[rand.nextInt(vowels.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10; // Number of characters appended
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new ReadableImpl(10));
        while (s.hasNext()) {
            System.out.println(s.next());
        }
    }
}
