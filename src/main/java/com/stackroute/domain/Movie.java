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
    //Passing actor object to the movie constructor
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
    //Creating method to display details
    public void actorDetails(){
        System.out.println(actor.getName()+" is a " +actor.getGender()+" of age: "+actor.getAge());

    }
    //Using ApplicationContext to get the bean
   public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    //Using BeanFactory to get the bean
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;

    }
    //Using BeanNameAware to get the bean
    public void setBeanName(String s) {
        this.name=s;
    }
}
