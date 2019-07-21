/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.access.building_A;

import static com.util.Print.printLearning;

/**
 *
 * @author ajinkya_rane
 */
public class CelebrateFestivalA {
    public static void main(String[] args){
        MemberA m1 = new MemberA("Rachel", 19600322);
        MemberA m2 = new MemberA("Ross", 19600101);
        //Member m3 = new MemberB("Joye",19620401);             //Method MemberB is not public
        
        FestivalA f1 = new FestivalA("Holloween", 12345);
        f1.addMemberForFestival(m1,m2);
        f1.printMemberList();
        //print(f1.festivalBudget);                             //festivalBudget has private access in FetstivalA
        
        m1.getFestivalList();
        m2.getFestivalList();
        printLearning(
                "Private Access members are available only in the class's(they have defined) methods.",
                "Pacakage Access members are available only in current package.",
                "Protected Access members are available with Package Access for same package and are available in derive class placed in different package.",
                "Public Access members can be access anyone anytime anywhere"
        );
        
    }
}
