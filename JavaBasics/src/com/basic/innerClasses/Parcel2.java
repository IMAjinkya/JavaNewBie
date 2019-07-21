/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.innerClasses;

import static com.util.Print.*;

/**
 *
 * @author arane
 */
interface Destination{
    String readLabel();
}

public class Parcel2 {
    private int parcelValue;
    Parcel2(int pValue){ parcelValue = pValue; }
    
    public Destination getDestination(String dest){
        class PDestination implements Destination{
            
            private String label;
            PDestination(String dest){ label = dest; }
            
            @Override
            public String readLabel() { return label; }
            
            @Override
            public String toString(){
                return getClass().getSimpleName() + "\t| label: "+label;
            }
        }
        
        return new PDestination(dest);
    }
    public String getTrackerSlipId(){
        if(parcelValue > 1000){
            class TrackerSlip{
                String slipId;
                TrackerSlip(String tId){ slipId = tId; }
                
                String getSlipId(){ return slipId; }
                
                @Override
                public String toString(){
                    return getClass().getSimpleName() + "\t | slipId: "+slipId;
                }
            }
            TrackerSlip slip = new TrackerSlip("ABD12365");
            return slip.getSlipId();
        }
        else{
            return "";
        }
    }
    
    
    public static void main(String[] args){
        Parcel2 p = new Parcel2(1010);
        print(p.getDestination("Mumbai"));
        print("Slip Id \t| "+p.getTrackerSlipId());
        printLearning(
            "Upcasting : Inner class is the implementation of the interface that can then be unseen and unavailable,"
            + "\n   which is convenient for hiding the implementation.",
            "Inner classes can be created within a method or even an arbitrary scope.",
            "Creation of entire class within the scope of a method is called Local Inner Class"
            + "\n   And it's not available outside the scope in which it is defined."
        );
    }
}
