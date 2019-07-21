/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic;

import java.util.Scanner;

/**
 *IterationTest program test usage of 'labels:' in Java.
 *It demonstrate How to break from multiple iterative loops using 'labels' 
 * @author ajinkya_rane
 */
public class IterationTest {
    @SuppressWarnings("SleepWhileInLoop")
    public static void main(String[] args) throws InterruptedException{
        Scanner s = new Scanner(System.in);
        String ans = "N";
        System.out.println("Enter number of elements to be iterated in outer loop :");
        int outerLoopLength = s.nextInt();
        
        
        System.out.println("Enter number of elements to be iterated in inner loop :");
        int innerLoopLength = s.nextInt();
        
        System.out.println("Enter inner loop index at which you want to perform operation(must be less than length of inner loop) :");
        int breakingInnerIndex = s.nextInt();
        
        do{
            System.out.println("Enter mode of operation :"
                    + "\n\t1. Enter 1 for break inner"
                    + "\n\t2. Enter 2 for continue inner"
                    + "\n\t3. Enter 3 for continue outer"
                    + "\n\t4. Enter 4 for break outer");
            int mode = s.nextInt();

            System.out.println("Iteration Starts...");

            OuterLoop:
            for(int outerIndex = 0; outerIndex < outerLoopLength; outerIndex++){
                InnerLoop:
                for(int innerIndex = 0; innerIndex < innerLoopLength; innerIndex++){
                    Thread.sleep(1000);
                    if(innerIndex == breakingInnerIndex){
                        if(mode == 1){
                            System.out.println("Case "+mode+": Breaking from inner and continuing outer");
                            break;
                        }
                        else if(mode == 2){
                            System.out.println("Case "+mode+": Continuing inner loop");
                            continue;
                        }
                        else if(mode == 3){
                            System.out.println("Case "+mode+": continuing outer loop");
                            continue OuterLoop;
                        }
                        else if(mode == 4){
                            System.out.println("Case "+mode+": Breaking from outer");
                            break OuterLoop;
                        }
                        else{
                            System.out.println("Invalid mode of operation hence iterating all elements");
                        }
                    }
                    System.out.println("Outer : "+outerIndex+ ", Inner : "+innerIndex);
                }
            }
            System.out.println("Do you want to continue with different mode of operation(Y/N)");
            ans  = s.next();
        }while(ans.equalsIgnoreCase("Y"));
        s.close();
    }
}
