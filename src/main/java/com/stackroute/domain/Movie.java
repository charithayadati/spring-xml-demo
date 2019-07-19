package com.stackroute.domain;

public class Movie {
    Actor actor;
    public void setActor(Actor actor) {
        this.actor = actor;
    }
//Creating method to display details
    public void actorDetails(){
        System.out.println(actor.getName()+" is a " +actor.getGender()+" of age: "+actor.getAge());

    }

}
