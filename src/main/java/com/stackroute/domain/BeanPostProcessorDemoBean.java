package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorDemoBean implements BeanPostProcessor {

    //Overriding the methods of interface
    public Object postProcessBeforeInitialization(Object beanpost, String beanName) throws BeansException {
        System.out.println("In postProcessBeforeInitialization method");
        return beanpost;
    }


    public Object postProcessAfterInitialization(Object beanpost, String beanName) throws BeansException {

        System.out.println("In postProcessAfterInitialization method");
        return beanpost;
    }
}
