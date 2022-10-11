package com.example.viewmodelwithfragments;

public class UserModel {

    String name;
    String email;

    public UserModel(String name, String pass) {
        this.name = name;
        this.email = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String pass) {
        this.email = pass;
    }
}
