package com.stackroute.domain;

public class Actor {
    private String gender;
    private int age;
    private String name;

    public Actor(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }
    

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

