/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.access.building_B;

import static com.util.Print.print;
import java.util.ArrayList;

/**
 *
 * @author ajinkya_rane
 */
public class MemberB {
    public String name;
    private final int bday;
    String f = "";
    
    public static ArrayList<String> memberList = new ArrayList<>();
    
    MemberB(String name, int bday) {
        this.name = name;
        this.bday = bday;
        memberList.add(name);
    }
    void setF(FestivalB f) {
        this.f = this.f + f.name + " ";
    }
    
    void getFestivalList(){
        print("Festival List of "+this.name+" is:"+f);
    } 
    public void getMemberList() {
        for(String m_name : memberList){
            print(m_name+" ");
        }
    }
}
