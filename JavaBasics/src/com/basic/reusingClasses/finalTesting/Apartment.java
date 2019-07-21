/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.reusingClasses.finalTesting;

import java.util.HashMap;

/**
 *
 * @author ajinkya_rane
 */
public class Apartment{
    static final int NO_OF_ROOMS = 32;                          //CompileTime (With Primitive) CONSTANT
    String name;                                
    final Member secretary;                                     //Blank Final
    final Member[] committeeMembers = new Member[2];
    final HashMap<String,Member> members = new HashMap<>();    //what is dimond interface ? <>
    
    Apartment(Member[] members,String secretaryRoomNo, String[] committeRoomNos) {
        for(Member member : members){
            this.members.put(member.roomNo,member);
        }
        
        this.secretary = this.getMember(secretaryRoomNo);
        int commiteeItr = 0;
        for(String roomNo : committeRoomNos){
            this.committeeMembers[commiteeItr++] = this.getMember(roomNo);
        }
    }
    
    void setName(final String name){                            //Final Arguments
        this.name = name;
    }
    
    final void setAppartmaentName(String name){                 //Final Method
        this.name = name;
    }
    
    //Making method private becasuse it is being access in constructor; 
    private Member getMember(String roomNo){
        if(members.containsKey(roomNo)){
            return members.get(roomNo);
        }
        else{
            throw new Error("No member found");
        }
    }
    
    void addMember(Member member){
        if(!members.containsKey(member.roomNo)){
            members.put(member.roomNo, member);
        }
    }
    void ModifyMember(String oldMemberRoomNo,Member newMember){
        members.put(oldMemberRoomNo, newMember);
    }
    
    @Override
    public String toString(){
        StringBuilder returnString = new StringBuilder();
        returnString.append("Name:\t\t").append(this.name);
        returnString.append("\n" + "NO_OF_ROOMS : \t").append(NO_OF_ROOMS);
        returnString.append("\n" + "MEMBERS : \t").append(this.members);
        returnString.append("\n" + "SECRETARY:\t").append(this.secretary);
        returnString.append("\n" + "COMMITTEE : \t");
        for(Member member : this.committeeMembers){
            returnString.append(member).append("\n\t\t");
        }
        return returnString.toString();
    }
}
