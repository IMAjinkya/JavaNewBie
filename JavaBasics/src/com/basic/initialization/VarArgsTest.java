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
public class VarArgsTest {
    public static void printVarArgs(int argsCnt,String... args){
        System.out.println("No. of arguments passed : "+argsCnt);
        int argsItr = 0;
        for(String arg : args){
            System.out.println("args "+argsItr+" :"+arg);
            argsItr++;
        }
        System.out.println("\n");
    }
    public static void main(String[] args){
        print("1. Arguments passed as paramters:"
                + "\n================================");
        printVarArgs(3,"Bob","Ron","Lily");
        print("2. Arguments passed as an Array:"
                + "\n===============================");
        String[] names = {"Ross","Monica","Pheebe","Joey"};
        printVarArgs(names.length,names);
        print("3. No Arguments passed :"
                + "\n=======================");
        printVarArgs(0);
        
    }
}
