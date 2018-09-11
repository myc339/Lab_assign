/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Lab1_5.program;

import com.Lab1_5.beans.Address;
import com.Lab1_5.beans.Person;
import java.lang.*;
/**
 *
 * @author myc
 */
public class Output {
    public static void main(String[] args) {
        Person person=new Person("Jow","Smith","");
    Address add1=new Address("360 HUntington Ave","130 Snell Engineering","Boston","MA","02115","USA");
    Address add2=new Address("100 Main Street","","Natick","MA","01760","USA");
    Address add3=new Address("201 Best Street","","Cool-town","Shanghai","","China");
        System.out.println("Person\nFirst name:"+person.getFirstName()+"\nLast name:"+person.getLastName());
        System.out.println("Work Address\nAddress Line1:"+add1.getStreetLine1()+"\nAddress Line2:"+
                add1.getStreetLine2()+"\nCity:"+add1.getCity()+"\nState:"+add1.getState()+"\nZip Code:"+
                 add1.getZipCode()+"\nCountry:"+add1.getCountry());
        System.out.println("Local Address\nAddress Line1:"+add2.getStreetLine1()+"\nAddress Line2:"+
                add2.getStreetLine2()+"\nCity:"+add2.getCity()+"\nState:"+add2.getState()+"\nZip Code:"+
                 add2.getZipCode()+"\nCountry:"+add2.getCountry());
        System.out.println("Sweet Home Address\nAddress Line1:"+add3.getStreetLine1()+"\nAddress Line2:"+
                add3.getStreetLine2()+"\nCity:"+add3.getCity()+"\nState:"+add3.getState()+"\nZip Code:"+
                 add3.getZipCode()+"\nCountry:"+add3.getCountry());
    }
    
    
}
