package com.stackroute.domain;

public class Movie {


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    Actor actor;

    public void actorDetails(){
        System.out.println(actor.getName()+" is a " +actor.getGender()+" of age: "+actor.getAge());

    }

}
