package com.fwhite.collegeapp_frankie;

import java.util.Date;

public class Profile {

    String lastName;
    String firstName;
    Date dateOfBirth;
    String objectId;
    String email;
    private String photoFileName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Profile(){
        dateOfBirth = new Date();
        lastName = "Frankie";
        firstName = "White";
        email = "alacornbob@gmail.com";
    }
        public String getObjectId(){
        return objectId;
        }

        public void setObjectId(String objectID){

            this.objectId = objectID;

        }
    public String getPhotoFilename(){
        return photoFileName;
    }

}
