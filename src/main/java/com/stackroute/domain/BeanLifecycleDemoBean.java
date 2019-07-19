package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

        //Overriding the methods of interfaces mentioned
    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean Initialized");
    }
    public void destroy() throws Exception {

        System.out.println("Bean Destroyed");
    }
    //Creating methods for manually displaying the bean lifecycle
    public void customInit() throws Exception{
        System.out.println("Bean initialized using custom-init");
    }
    public void customDestroy() throws  Exception{
        System.out.println("Bean destroyed using custom-destroy");
    }

}



