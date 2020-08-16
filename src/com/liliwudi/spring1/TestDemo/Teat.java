package com.liliwudi.spring1.TestDemo;

import com.liliwudi.spring1.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teat {

    @Test
    public void test(){
        // 1、
      ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //  BeanFactory context = new ClassPathXmlApplicationContext("bean2.xml");
       User user = context.getBean("user",User.class);
        user.add();


    }

}
