package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



public class Main {
    public static void main(String[] args) {

       //using Application Context
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie film = context.getBean("movie", Movie.class);
        film.actorDetails();

        //Using XmlBeanFactory
        Resource resource = new ClassPathResource("beans.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        Movie movie = beanFactory.getBean("movie", Movie.class);
        film.actorDetails();

        //Using BeanDefinitionReader and BeanDefinitionRegistry
        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
        Movie movie1 = (Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
        movie1.actorDetails();

    }
}
