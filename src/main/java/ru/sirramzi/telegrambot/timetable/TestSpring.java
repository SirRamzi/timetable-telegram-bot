package ru.sirramzi.telegrambot.timetable;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music musicBean = context.getBean("musicBean", Music.class);
        System.out.println(musicBean.getSong());
        context.close();
    }
}
