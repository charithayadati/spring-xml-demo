package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

       //using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie film = context.getBean("movie1", Movie.class);
        System.out.println("By using autowiring byName  ");
        film.actorDetails();

    }
}
