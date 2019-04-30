package com.fwhite.collegeapp_frankie;

public class Sibling extends FamilyMember {
    String firstName;
    String lastName;

    public Sibling(){
        super();
    }

    public String toString(){
        String result = "Sibling: " + this.getFirstName() + this.getLastName();
        return result;
    }
    public Sibling(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}