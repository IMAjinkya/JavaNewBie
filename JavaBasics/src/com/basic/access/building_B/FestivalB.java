/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.access.building_B;

import com.basic.access.building_A.*;
import static com.util.Print.*;
import java.util.ArrayList;

/**
 *
 * @author ajinkya_rane
 */
public class FestivalB {
    public String name;
    private int festivalBudget;
    
    String member_participents = "";
    
    FestivalB(String name,int festivBdgt) {
        this.name = name;
        this.festivalBudget = festivBdgt;
    }
    
    void addMemberForFestival(MemberB... members){
        for(MemberB member : members){
            member_participents = member_participents + member.name +" ";
            member.setF(this);
            //print(member.bday);                           //bDay is private access member
        }
    }
    void printMemberList(){
        print("MemeberList for festival "+this.name+" are:"+member_participents);
    }
}
