package com.atlantis;

import com.atlantis.code.JavaCollection;
import com.atlantis.code.TextEditor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Syusuke on 2016/6/17 001..
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext content =new ClassPathXmlApplicationContext("SpringBeans.xml");
//        HelloSpring obj = (HelloSpring) content.getBean("helloSpring");
//        obj.getMessage();


//        TextEditor te = (TextEditor) content.getBean("textEditor");
//        te.spellCheck();

        System.out.println("------------------------------------------");
        JavaCollection jc = (JavaCollection) content.getBean("jc");
        jc.getAddressList();
        jc.getAddressSet();
        jc.getAddressMap();
        jc.getAddressProp();
    }
}
