package com.stackroute.domain;

public class Actor {
    
        //Creating getter and setter methods for literals
    private String gender;

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    private String name;



   public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }




}

