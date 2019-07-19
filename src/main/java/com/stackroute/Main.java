package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {
       //Using ApplicationContext
      ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
      Movie movie=context.getBean("movie",Movie.class);
      movie.setApplicationContext(context);
      movie.actorDetails();
    //Using BeanFactory
      BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
      Movie movie1=beanFactory.getBean("movie",Movie.class);
      movie1.setBeanFactory(beanFactory);
      movie1.actorDetails();
    //UsingBeanNameAware
        Movie movie2=context.getBean("movie",Movie.class);
        movie2.setBeanName("movie1");
        movie2.actorDetails();



    }
}
