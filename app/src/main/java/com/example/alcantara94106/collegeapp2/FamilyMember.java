package com.example.alcantara94106.collegeapp2;

/**
 * Created by alcantara94106 on 3/9/2017.
 */

public abstract class FamilyMember {
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
