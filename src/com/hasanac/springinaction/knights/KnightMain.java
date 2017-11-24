package com.hasanac.springinaction.knights;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by christopherhasanali on 11/24/17.
 */
public class KnightMain {
    public static void main(String []args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/application-context.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
