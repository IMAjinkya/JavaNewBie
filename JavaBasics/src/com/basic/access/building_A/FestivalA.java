/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.access.building_A;

import static com.util.Print.*;
/**
 *
 * @author ajinkya_rane
 */
public class FestivalA {
    public String name;
    private int festivalBudget;
    
    String member_participents = "";
    
    FestivalA(String name,int festivBdgt) {
        this.name = name;
        this.festivalBudget = festivBdgt;
    }
    
    void addMemberForFestival(MemberA... members){
        for(MemberA member : members){
            member_participents = member_participents + member.name +" ";
            member.setF(this);
            //print(member.bday);                           //bDay is private access member
        }
    }
    void printMemberList(){
        print("MemeberList for festival "+this.name+" are:"+member_participents);
    }
}
