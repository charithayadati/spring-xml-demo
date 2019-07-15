package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
    BeanLifecycleDemoBean bean=context.getBean("bean",BeanLifecycleDemoBean.class);
    context.close();
  }
}
