package com.example.testproject.singletonpattern;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean bean = applicationContext.getBean(MyBean.class);
        MyBean bean1 = applicationContext.getBean(MyBean.class);

        System.out.println("bean = " + bean);
        System.out.println("bean1 = " + bean1);
    }
}
