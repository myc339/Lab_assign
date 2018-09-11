/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Lab1_5.beans;
import com.Lab1_5.beans.Address;
/**
 *
 * @author myc
 */
public class Person {
    private String FirstName;
    private String LastName;
    private String DOB;

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
   public Person(String fisrtname,String lastname,String dob)
    {
        this.FirstName=fisrtname;
        this.LastName=lastname;
        this.DOB=dob;
    }
}
