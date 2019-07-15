package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {


    public void afterPropertiesSet() throws Exception {

        System.out.println("Bean Initialized");
    }
    public void destroy() throws Exception {

        System.out.println("Bean Destroyed");
    }

    public void customInit() throws Exception{
        System.out.println("Bean initialized using custom-init");
    }
    public void customDestroy() throws  Exception{
        System.out.println("Bean destroyed using custom-destroy");
    }

}



