package com.atlantis;

import com.atlantis.code.HelloSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Syusuke on 2016/6/17 001..ß7..
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext content =new ClassPathXmlApplicationContext("SpringBeans.xml");
        HelloSpring obj = (HelloSpring) content.getBean("helloSpring");
        obj.getMessage();
    }
}
