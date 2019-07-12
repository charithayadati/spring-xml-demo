package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

       //using Application Context
       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie film = context.getBean("movie1", Movie.class);
        film.actorDetails();
        Movie film1 = context.getBean("movie1", Movie.class);
        film1.actorDetails();
        //showing the equality of beans
        System.out.println(film==film1);
        Movie film2 = context.getBean("movie2", Movie.class);
        film2.actorDetails();
        Movie film3 = context.getBean("movie2", Movie.class);
        film3.actorDetails();
        //showing with scope as prototype
        System.out.println("showing equality of beans using scope as prototype");
        System.out.println(film2==film3);
        Movie film4 = context.getBean("movie3", Movie.class);
        film4.actorDetails();
        Movie film5 = context.getBean("movie4", Movie.class);
        film5.actorDetails();






    }
}
