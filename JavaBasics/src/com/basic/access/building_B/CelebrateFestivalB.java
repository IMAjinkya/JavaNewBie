/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.access.building_B;

import com.basic.access.building_A.MemberA;
import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
public class CelebrateFestivalB {
    public static void main(String[] args){
        MemberB m1 = new MemberB("Joye", 19600322);
        MemberB m2 = new MemberB("Monica", 19600101);    
        //Member m3 = new MemberA("Ross",19620401);             //Method MemberA is not public
        
        FestivalB f1 = new FestivalB("X'Mas", 12345);
        f1.addMemberForFestival(m1,m2);
        f1.printMemberList();
        //print(f1.festivalBudget);                             //festivalBudget has private access in FetstivalB
        
        m1.getFestivalList();
        m2.getFestivalList();
        
    }
}
