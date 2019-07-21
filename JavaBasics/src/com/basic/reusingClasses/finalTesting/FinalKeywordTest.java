/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.reusingClasses.finalTesting;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
class person{
    String name;

    public person(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString(){
        return "Name: "+this.name;
    }
}

class Member extends person{
    String roomNo;

    public Member(String name,String roomNo) {
        super(name);
        this.roomNo = roomNo;
    }
    
    @Override
    public String toString() {
        return super.toString()+" RoomNo: "+roomNo;
    }
}

class commercialAppartment extends Apartment{

    public commercialAppartment(Member[] members, String secretaryRoomNo, String[] committeRoomNos) {
        super(members, secretaryRoomNo, committeRoomNos);
    }
    
    @Override
    void setName(String name){
        super.name = name;
    }
    
    //@Override
    void setAppartmentName(String name){
        super.name = name;
    }
}

public class FinalKeywordTest {
    public static void main(String[] args){
        Member[] members1 = { new Member("Ross","A1"), new Member("Monica","A2")};
        String[] committee = {"A1","A2"};
        Apartment a1 = new Apartment(members1, "A1", committee);
        a1.setName("Happy Home");
        print("Apartment 1: \n"+a1.toString());
        
        Member[] members2 = { new Member("Ajinkya","A1"), new Member("Ashwini","A2"), new Member("Pheabe","B1"), new Member("Rahul","B2")};
        String[] committee1 = {"B1","A2"};
        Apartment a2 = new Apartment(members2, "B1", committee1);
        a2.setName("Sweet Home");
        print("Apartment 2: \n"+a2.toString());
        
        printLearning(
            "Final Data : "
                +"\n\t- Compile-Time Constant : Primitive - Static final"
                +"\n\t- Run-time Constant : Blank Finals - Initialization values are not given."
                +"\n\t- You should assign either an expression or while defining or assign value in Each of the constructor."
                +"\n\t- Once final constant by reference is initialized to an object, it can nver be changed to point another"
                    +"object. However the object itself can be modified.",
            "Final Arguments : \tArguments that can't be channged.",
            "Final Methods : \tCan't inherit this method. but can create same in derive class having no connection to bas class.",
            "Final Class : \tCan not inherit from this class. All methods are implicitly Final."
        );
    }
}
