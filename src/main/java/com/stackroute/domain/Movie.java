package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware,BeanFactoryAware ,BeanNameAware{

    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;
    private String name;

    Actor actor;
    public Movie(){

    }

    public Movie(Actor actor){
        this.actor=actor;
    }


    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public String getName() {
        return name;
    }

    public Actor getActor() {
        return actor;
    }



    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void actorDetails(){
        System.out.println(actor.getName()+" is a " +actor.getGender()+" of age: "+actor.getAge());

    }
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;

    }

    public void setBeanName(String s) {
        this.name=s;
    }
}
