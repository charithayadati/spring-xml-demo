package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.BeanPostProcessorDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    //Using ApplicationContext for getting bean
    ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    BeanLifecycleDemoBean bean=context.getBean("bean",BeanLifecycleDemoBean.class);
    BeanPostProcessorDemoBean beanpost=context.getBean("beanpost",BeanPostProcessorDemoBean.class);
    context.close();
  }
}
