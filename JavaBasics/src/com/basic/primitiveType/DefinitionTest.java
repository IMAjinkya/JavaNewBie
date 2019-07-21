/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.primitiveType;

/**
 *
 * @author ajinkya_rane
 */
public class DefinitionTest {
    public static void main(String[] args){
        /*8 Bits*/
        byte p_b =  127;
        byte m_b = -128;
        
        /*16 Bits*/
        System.out.println("(2^16-1) MAX SHORT:"+Short.MAX_VALUE);  //32767
        System.out.println("(2^16-1) MIN SHORT:"+Short.MIN_VALUE);  //-32768
        /*32 Bits*/
        float f = 1234.56789f;
        System.out.println("(2^31-1) MAX INT:"+Integer.MAX_VALUE);  //+2147483647
        System.out.println("(2^31) MIN INT:"+Integer.MIN_VALUE);    //-2147483648
        
        /*64 Bits*/
        double d = 1234567.8912345;
        System.out.println("(2^63-1) MAX LONG:"+Long.MAX_VALUE);    //+9223372036854775807
        System.out.println("(2^63) MIN LONG:"+Long.MIN_VALUE);      //-9223372036854775808
        
    }
}
