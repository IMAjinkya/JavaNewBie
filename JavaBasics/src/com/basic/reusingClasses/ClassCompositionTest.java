/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.basic.reusingClasses;

import static com.util.Print.*;

/**
 *
 * @author ajinkya_rane
 */
class IdentityInfo{
    int PANID,SSID;

    public IdentityInfo(int PANID, int SSID) {
        this.PANID = PANID;
        this.SSID = SSID;
        print("In IdentityInfo constructor:\n"+this.toString());
    }

    @Override
    public String toString() {
        return "IdentityInfo{" + "PANID=" + PANID + "\n SSID=" + SSID + '}';
    }
    
}

class CareerInfo{
    String highestEducation,officeName;

    public CareerInfo(String highestEducation, String officeName) {
        this.highestEducation = highestEducation;
        this.officeName = officeName;
        print("In CareerInfo constructor:\n"+this.toString());
    }

    @Override
    public String toString() {
        return "CareerInfo{" + "highestEducation=" + highestEducation + "\n officeName=" + officeName + '}';
    }
    
}

class SocialInfo{
    String hobbies,likes,dislikes;

    public SocialInfo(String hobbies, String likes, String dislikes) {
        this.hobbies = hobbies;
        this.likes = likes;
        this.dislikes = dislikes;
    }

    @Override
    public String toString() {
        return "SocialInfo{" + "hobbies=" + hobbies + "\n likes=" + likes + "\n dislikes=" + dislikes + '}';
    }
    
}

class Person{
    String Name;
    int height,weight;
    String sex,maritialStatus,dummyInstanceInitialize;
    String dummyInlineInitialize = "Dummy1";                            //1. Inline Initialization
    int phoneNo;
    IdentityInfo idInfo;
    CareerInfo cInfo;
    SocialInfo sInfo;
    
    //Instance Initialization
    {
        print("\n1. Primitive initialization:\n"+this.toString());
        dummyInstanceInitialize = "Dummy2";                             //2. Instance Initilization
        print("\n2. Instance initialization:\n"+this.toString()+"\n");
    }

    public Person(String Name, int height, int weight, String sex, String maritialStatus, int phoneNo,int panId,int ssId) {
        this.Name = Name;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.maritialStatus = maritialStatus;
        this.phoneNo = phoneNo;
        this.idInfo = new IdentityInfo(panId, ssId);                    //3. Constructor Initilization
        print("\n3. Contructor initialization:\n"+this.toString());
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + "\n height=" + height + "\n weight=" + weight + "\n sex=" + sex + "\n maritialStatus=" + maritialStatus + "\n dummyInstanceInitialize=" + dummyInstanceInitialize + "\n dummyInlineInitialize=" + dummyInlineInitialize + "\n phoneNo=" + phoneNo + "\n idInfo=" + idInfo + "\n cInfo=" + cInfo + "\n sInfo=" + sInfo + '}';
    }
    
    public void setCareerinfo(boolean isCareerinfoAvailable, String highestEducation, String officeName){
        if(isCareerinfoAvailable == true){
            this.cInfo = new CareerInfo(highestEducation, officeName);  //4. Lazy Initialization
            print("\n3. Lazy initialization:\n"+this.toString());
        }
    }
}

public class ClassCompositionTest {
    public static void main(String[] args){
        Person p = new Person("Ross", 180, 75, "Male", "Single",123455, 435768, 9876);
        p.setCareerinfo(true, "‎Ph.D in Paleontology", "New York Museum of Prehistoric History");
        print("\nLast Status : \n"+p.toString());
        printLearning(
            "Reference Initialization : At the point object is defined.",
            "Reference Initialization : Using Instance Initialization.",
            "Reference Initialization : In Constructor.",
            "Reference Initialization : Lazy Initialization."
        );
    }
}
